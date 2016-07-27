package com.crg.bitmapillegalargumentexceptiondemo;

import android.app.Application;

import com.tencent.bugly.crashreport.CrashReport;

/**
 * Created by crg on 16-7-27.
 */
public class MainApplication  extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        CrashReport.initCrashReport(getApplicationContext(), "e7919f2d4c", true);
    }
}
