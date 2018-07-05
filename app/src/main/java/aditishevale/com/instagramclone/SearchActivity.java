package aditishevale.com.instagramclone;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import aditishevale.com.instagramclone.Utils.BottomNavigationViewHelper;

public class SearchActivity extends AppCompatActivity {
    private static final String TAG = "SearchActivity";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setupBottomNavigationView();
    }


    private void setupBottomNavigationView(){
        Log.d(TAG,"BottomNavigationView");

        BottomNavigationViewEx bottomNavigationViewEx =(BottomNavigationViewEx)
                findViewById(R.id.bottomNavViewBar);
        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationViewEx);

    }

}
