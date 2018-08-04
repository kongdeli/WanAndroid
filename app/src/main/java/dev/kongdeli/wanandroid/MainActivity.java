package dev.kongdeli.wanandroid;

import android.app.TimePickerDialog;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;
import android.widget.FrameLayout;

import butterknife.BindView;

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
}