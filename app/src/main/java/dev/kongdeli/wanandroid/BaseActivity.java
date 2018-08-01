package dev.kongdeli.wanandroid;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Dale on 2018/7/31.
 */

public abstract class BaseActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout mParentLinearLayout;
    private Unbinder mUnbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initContentView(R.layout.activity_base);
        setContentView(getLayoutId());
        mUnbinder = ButterKnife.bind(this);
        initData();
    }

    protected abstract void initData();

    protected abstract int getLayoutId();

    private void initContentView(int resId) {
        ViewGroup viewGroup = findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        mParentLinearLayout = new LinearLayout(this);
        mParentLinearLayout.setOrientation(LinearLayout.VERTICAL);
        viewGroup.addView(mParentLinearLayout);
        //渲染包含toolbar的view
        LayoutInflater.from(this).inflate(resId, mParentLinearLayout, true);
        ((TextView) findViewById(R.id.tv_title)).setText(getTitle());
    }

    @Override
    public void setContentView(@LayoutRes int layoutResId) {
        LayoutInflater.from(this).inflate(layoutResId, mParentLinearLayout, true);
    }

    @Override
    protected void onDestroy() {
        mUnbinder.unbind();
        super.onDestroy();
    }

    @Override
    public void onClick(View v) {

    }
}
