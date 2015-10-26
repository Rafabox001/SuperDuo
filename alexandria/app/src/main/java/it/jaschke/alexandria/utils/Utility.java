package it.jaschke.alexandria.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by Rafael on 25/10/2015.
 */
public class Utility {

    private Context context;


    static public boolean isNetworkAvailable(Context c){
        ConnectivityManager cm = (ConnectivityManager)c.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        return activeNetwork !=null && activeNetwork.isConnectedOrConnecting();
    }
}
