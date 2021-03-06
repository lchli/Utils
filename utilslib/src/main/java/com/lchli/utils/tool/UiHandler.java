package com.lchli.utils.tool;

import android.os.Handler;
import android.os.Looper;

public class UiHandler {

    private static Handler sHandler = new Handler(Looper.getMainLooper());

    public static void post(Runnable r) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            r.run();
        } else {
            sHandler.post(r);
        }
    }

    public static void postDelay(Runnable r, long delayMills) {

        sHandler.postDelayed(r, delayMills);
    }
}
