package dev.kongdeli.wanandroid;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Dale on 2018/7/31.
 */

public abstract class BaseActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.toolbar)
    Toolbar mToolbar;

    private Unbinder mUnBinder;
    private FrameLayout mFlContent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        setContentView(getLayoutId());
        mUnBinder = ButterKnife.bind(this);
//        mTvTitle.setText(getTitle());
        setSupportActionBar(mToolbar);
        setBackIcon();
        initView();
        initData();
    }

    protected abstract void initView();

    private void setBackIcon() {
//        mActionBar.setDisplayHomeAsUpEnabled(true);
//        mActionBar.setDisplayShowHomeEnabled(true);
//        mToolbar.setNavigationIcon();

    }

    protected abstract void initData();

    protected abstract int getLayoutId();

    @Override
    public void setContentView(@LayoutRes int layoutResId) {
        if (R.layout.activity_base == layoutResId) {
            super.setContentView(layoutResId);
            mFlContent = findViewById(R.id.fl_content);
            mFlContent.removeAllViews();
        } else {
            View content = LayoutInflater.from(this).inflate(layoutResId, null);
            mFlContent.addView(content);
        }

    }

    @Override
    protected void onDestroy() {
        mUnBinder.unbind();
        super.onDestroy();
    }

    @Override
    public void onClick(View v) {

    }
}
