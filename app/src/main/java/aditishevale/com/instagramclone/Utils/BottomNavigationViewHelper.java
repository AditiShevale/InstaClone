package aditishevale.com.instagramclone.Utils;

import android.util.Log;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class BottomNavigationViewHelper {

    private static final String TAG ="BottomNavigationViewHE1";

    public static void setupBottomNavigationView(BottomNavigationViewEx
                                                    bottomNavigationViewEx){
        Log.d(TAG,"setUpBottomNavigationView: Setting up Navigation");

        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);

    }

}
