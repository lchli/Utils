package com.lchli.utils.tool;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by lchli on 2016/4/3.
 */
public class EventBusUtils {

    public static void register(Object subcriper) {
        if (!EventBus.getDefault().isRegistered(subcriper)) {
            EventBus.getDefault().register(subcriper);
        }
    }

    public static void unregister(Object subcriper) {
        if (EventBus.getDefault().isRegistered(subcriper)) {
            EventBus.getDefault().unregister(subcriper);
        }
    }

    public static void post(Object event) {
        EventBus.getDefault().post(event);
    }
}
