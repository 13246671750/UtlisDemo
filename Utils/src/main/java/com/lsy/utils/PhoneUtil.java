package com.lsy.utils;

import android.content.Context;
import android.location.LocationManager;

import static android.content.Context.LOCATION_SERVICE;

public class PhoneUtil {

    public static boolean isOpenGPS(Context context){
        LocationManager manager = (LocationManager) context.getSystemService(LOCATION_SERVICE);
        boolean isGPS = manager.isProviderEnabled(LocationManager.GPS_PROVIDER);
        boolean isNetwork = manager.isProviderEnabled(LocationManager.NETWORK_PROVIDER);

        return isGPS|| isNetwork;
    }

}
