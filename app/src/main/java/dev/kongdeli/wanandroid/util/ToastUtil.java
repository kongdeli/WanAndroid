package dev.kongdeli.wanandroid.util;

import android.widget.Toast;

import dev.kongdeli.wanandroid.MyApplication;

public class ToastUtil {

    public static void showShort(String msg) {
        Toast.makeText(MyApplication.getAppContext(), msg, Toast.LENGTH_SHORT).show();
    }
}
