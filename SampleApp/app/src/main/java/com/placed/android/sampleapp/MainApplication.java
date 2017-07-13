package com.placed.android.sampleapp;

import android.app.Application;

import com.placed.client.android.SdkMods;

/**
 * Created by julianlo on 7/10/17.
 */

public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SdkMods.enableLogging();
        SdkMods.useStaging();
        SdkMods.disablePassive();
    }
}
