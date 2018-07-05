package aditishevale.com.instagramclone;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import aditishevale.com.instagramclone.Utils.BottomNavigationViewHelper;

public class SearchActivity extends AppCompatActivity {
    private static final String TAG = "SearchActivity";
    private static final int Activity_num= 1;
    private Context mContext = SearchActivity.this;
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
        BottomNavigationViewHelper.enableNavigation(mContext,bottomNavigationViewEx);
        Menu menu = bottomNavigationViewEx.getMenu();
        //Reference the Activity You Want to Have Reference of
        MenuItem menuItem = menu.getItem(Activity_num);
        menuItem.setChecked(true);


    }


}
