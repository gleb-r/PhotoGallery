package com.example.gleb.photogallery;

import android.content.Context;
import android.preference.PreferenceManager;

/**
 * Created by Gleb on 31.08.2017.
 */

public class QueryPrefernces {
    private static final String PREF_SEARCH_QUERY = "serchQuery";

    public static String getStoredQuery (Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context)
                .getString(PREF_SEARCH_QUERY,null);
    }

    public static void setStoredQuery (Context context, String query) {
        PreferenceManager.getDefaultSharedPreferences(context)
                .edit()
                .putString(PREF_SEARCH_QUERY, query)
                .apply();
    }
}
