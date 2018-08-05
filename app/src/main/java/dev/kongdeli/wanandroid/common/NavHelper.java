package dev.kongdeli.wanandroid.common;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.util.SparseArray;

public class NavHelper {
    private static final String TAG = NavHelper.class.getSimpleName();
    private SparseArray<Tab> mTabs = new SparseArray<>();
    private final Context mContext;
    private final FragmentManager mFragManager;
    private final int mContainerId;
    private Tab mCurrentTab;
    private OnTabChangeListener mTabChangeListener;

    public NavHelper(Context context, FragmentManager fm, @IdRes int containerId, OnTabChangeListener listener) {
        this.mContext = context;
        this.mFragManager = fm;
        this.mContainerId = containerId;
        this.mTabChangeListener = listener;
    }

    public NavHelper add(int menuId, Tab tab) {
        mTabs.put(menuId, tab);
        Log.d(TAG, "add: " + mTabs.toString());
        return this;
    }

    public static class Tab {
        private final Class<?> clazz;
        public int extra;
        public Fragment fragment;

        public Tab(Class<?> clazz, int extra) {
            this.clazz = clazz;
            this.extra = extra;
        }
    }

    public interface OnTabChangeListener {
        void onTabChange(Tab newTab, Tab oldTab);

        void onTabReSelect(Tab tab);
    }

    public boolean performClickMenu(int itemId) {
        Tab tab = mTabs.get(itemId);
        if (tab != null) {
            doSelect(tab);
            return true;
        }
        return false;
    }

    private void doSelect(Tab tab) {
        Tab oldTab = null;
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

    private void doTabChange(Tab newTab, Tab oldTab) {
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

    private void notifySelected(Tab newTab, Tab oldTab) {
        if (mTabChangeListener != null) {
            mTabChangeListener.onTabChange(newTab, oldTab);
        }
    }

    private void notifyReselected(Tab tab) {
        if(mTabChangeListener!=null) {
            mTabChangeListener.onTabReSelect(tab);
        }
    }
}
