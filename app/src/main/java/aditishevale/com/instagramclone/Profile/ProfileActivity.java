package aditishevale.com.instagramclone.Profile;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import aditishevale.com.instagramclone.R;
import aditishevale.com.instagramclone.Utils.BottomNavigationViewHelper;

public class ProfileActivity extends AppCompatActivity {
    private static final String TAG = "ProfileActivity";
    private static final int Activity_num = 4;
    private Context mContext = ProfileActivity.this;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setupBottomNavigationView();
    }


    //Method For Setting BottomNavigation

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
