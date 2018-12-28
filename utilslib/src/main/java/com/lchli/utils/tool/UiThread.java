package com.lchli.utils.tool;

import android.os.Handler;
import android.os.Looper;

/**
 * Created by bbt-team on 2017/8/2.
 */

public class UiThread {

    private static final Handler uiHandler = new Handler(Looper.getMainLooper());

    public static void run(Runnable r) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            r.run();
            return;
        }
        uiHandler.post(r);
    }
}
