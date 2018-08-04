package dev.kongdeli.wanandroid;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.util.SparseArray;

public class NavHelper<T> {
    private static final String TAG = NavHelper.class.getSimpleName();
    private SparseArray<Tab<T>> mTabs = new SparseArray<>();
    private final Context mContext;
    private final FragmentManager mFragManager;
    private final int mContainerId;
    private Tab<T> mCurrentTab;
    private OnTabChangeListener mTabChangeListener;

    public NavHelper(Context context, FragmentManager fm, @IdRes int containerId, OnTabChangeListener listener) {
        this.mContext = context;
        this.mFragManager = fm;
        this.mContainerId = containerId;
        this.mTabChangeListener = listener;
    }

    public NavHelper<T> add(int menuId, Tab<T> tab) {
        mTabs.put(menuId, tab);
        Log.d(TAG, "add: " + mTabs.toString());
        return this;
    }

    public static class Tab<T> {
        private final Class<?> clazz;
        public final T extra;
        public Fragment fragment;

        public Tab(Class<?> clazz, T extra) {
            this.clazz = clazz;
            this.extra = extra;
        }
    }

    public interface OnTabChangeListener<T> {
        void onTabChange(Tab<T> newTab, Tab<T> oldTab);
    }

    public boolean performClickMenu(int itemId) {
        Tab<T> tab = mTabs.get(itemId);
        if (tab != null) {
            doSelect(tab);
            return true;
        }
        return false;
    }

    private void doSelect(Tab<T> tab) {
        Tab<T> oldTab = null;
        if (mCurrentTab != null) {
            oldTab = mCurrentTab;
            if (oldTab == tab) {
                notifyReselected(tab);
                return;
            }
        }
        mCurrentTab = tab;
        doTabChange(mCurrentTab, oldTab);
    }

    private void doTabChange(Tab<T> newTab, Tab<T> oldTab) {
        FragmentTransaction ft = mFragManager.beginTransaction();
        if (oldTab != null) {
            if (oldTab.fragment != null) {
                ft.detach(oldTab.fragment);
            }
        }
        if (newTab != null) {
            if (newTab.fragment == null) {
                newTab.fragment = Fragment.instantiate(mContext, newTab.clazz.getName(), null);
                ft.add(mContainerId, newTab.fragment, newTab.clazz.getName());
            } else {
                ft.attach(newTab.fragment);
            }
        }
        ft.commit();
        notifySelected(newTab, oldTab);
    }

    private void notifySelected(Tab<T> newTab, Tab<T> oldTab) {
        if (mTabChangeListener != null) {
            mTabChangeListener.onTabChange(newTab, oldTab);
        }
    }

    private void notifyReselected(Tab<T> tab) {

    }
}
