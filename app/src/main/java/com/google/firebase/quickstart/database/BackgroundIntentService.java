package com.google.firebase.quickstart.database;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

public class BackgroundIntentService extends IntentService {

    private static final String TAG = "BackgroundIntentService";

    public BackgroundIntentService() {
        super("BackgroundIntentService");

    }
    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.i(TAG, "Connected to background intent service");



    }
}
