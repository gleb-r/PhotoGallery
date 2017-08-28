package com.example.gleb.photogallery;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by Gleb on 28.08.2017.
 */

public class PollService extends IntentService {

    private static final String TAG = "PollService";

    public static Intent newIntent (Context context) {
        return new Intent(context,PollService.class);
    }

    public PollService() {
        super(TAG);
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.i(TAG,"Received an intent: "+intent);
    }

    private boolean isNetworkAvalableAndConnected() {
        ConnectivityManager connectivityManager =
                (ConnectivityManager)getSystemService(CONNECTIVITY_SERVICE);
        boolean isNetworkAvailable = connectivityManager.getActiveNetworkInfo()!= null;
        boolean isNetworlConnected =
                isNetworkAvailable && connectivityManager.getActiveNetworkInfo().isConnected();
        return isNetworlConnected;

    }
}
