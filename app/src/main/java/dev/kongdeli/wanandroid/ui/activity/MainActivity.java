package dev.kongdeli.wanandroid.ui.activity;

import android.app.TimePickerDialog;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import butterknife.BindView;
import dev.kongdeli.wanandroid.R;
import dev.kongdeli.wanandroid.service.entity.HomeBean;
import dev.kongdeli.wanandroid.common.NavHelper;
import dev.kongdeli.wanandroid.ui.fragments.HomeFragment;
import dev.kongdeli.wanandroid.ui.fragments.HotFragment;
import dev.kongdeli.wanandroid.ui.fragments.UserCenterFragment;
import dev.kongdeli.wanandroid.service.services.ArticleService;
import dev.kongdeli.wanandroid.util.ToastUtil;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends BaseActivity implements BottomNavigationView.OnNavigationItemSelectedListener,
        NavHelper.OnTabChangeListener {

    private static final String TAG = MainActivity.class.getSimpleName();
    @BindView(R.id.bottom_nav)
    BottomNavigationView mBottomNav;
    @BindView(R.id.fl_container)
    FrameLayout mFlContainer;
    private TimePickerDialog mDialog;
    private NavHelper mNavHelper;

    @Override
    protected void initView() {
        mNavHelper = new NavHelper(this, getSupportFragmentManager(), R.id.fl_container, this);
        mNavHelper.add(R.id.menu_home, new NavHelper.Tab(HomeFragment.class, R.string.fg_home_title))
                .add(R.id.menu_hot, new NavHelper.Tab(HotFragment.class, R.string.fg_hot_title))
                .add(R.id.menu_center, new NavHelper.Tab(UserCenterFragment.class, R.string.fg_user_center_title));
        mBottomNav.setOnNavigationItemSelectedListener(this);
        mBottomNav.getMenu().performIdentifierAction(R.id.menu_home, 0);
    }

    @Override
    protected void initData() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.wanandroid.com/")
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().create()))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        ArticleService service = retrofit.create(ArticleService.class);
        Observable<HomeBean> observable = service.getHomeArticle(0);
        observable.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<HomeBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(HomeBean homeBean) {
                        ToastUtil.showShort("success");
                        Log.d(TAG, "onNext: " + new Gson().toJson(homeBean));
                    }

                    @Override
                    public void onError(Throwable e) {
                        ToastUtil.showShort("net error");
                    }

                    @Override
                    public void onComplete() {

                    }
                });


//        call.enqueue(new Callback<HomeBean>() {
//            @Override
//            public void onResponse(Call<HomeBean> call, Response<HomeBean> response) {
//                Log.d(TAG, "onResponse: " + new Gson().toJson(response.body()));
//            }
//
//            @Override
//            public void onFailure(Call<HomeBean> call, Throwable t) {
//                Toast.makeText(mContext, "net error", Toast.LENGTH_SHORT).show();
//            }
//        });
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return mNavHelper.performClickMenu(item.getItemId());
    }

    @Override
    public void onTabChange(NavHelper.Tab newTab, NavHelper.Tab oldTab) {
        Log.d(TAG, "onTabChange: " + getString((Integer) newTab.extra));
        setTitle((Integer) newTab.extra);
    }

    @Override
    public void onTabReSelect(NavHelper.Tab tab) {
        //refresh
    }
}