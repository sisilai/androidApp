package com.example.sisilai.myapplication;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sisilai on 2015/10/19.
 */
public class activityFactory {
    public static List<Activity> activities = new ArrayList<>();

    public static void addActivity(Activity activity) {
        activities.add(activity);
    }

    public static void removeActivity(Activity activity) {
        activities.remove(activity);
    }

    public static void delActivity() {
        for (Activity activity:activities) {
            if(!activity.isFinishing()) {
                activity.finish();
            }
        }
    }
}
