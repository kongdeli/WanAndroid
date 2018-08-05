package dev.kongdeli.wanandroid;

import android.app.Application;
import android.content.Context;

/**
 * Created by Dale on 2018/8/1.
 */

public class MyApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getAppContext() {
        return context;
    }
}
