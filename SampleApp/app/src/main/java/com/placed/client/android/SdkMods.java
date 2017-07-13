package com.placed.client.android;

/**
 * Created by julianlo on 7/10/17.
 */

public class SdkMods {

    public static void enableLogging() {
        Config.LOG_MODE = true;
        Config.LOG_MODE_PLACED = true;
    }

    public static void useStaging() {
        Config.PLACED_DEVICE_URI = "https://staging-api.placed.com/api/v2";
    }

    public static void disablePassive() {
        Config.ENABLE_PASSIVE_LOCATION = false;
    }
}
