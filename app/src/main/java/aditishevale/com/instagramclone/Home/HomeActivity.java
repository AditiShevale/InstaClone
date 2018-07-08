package aditishevale.com.instagramclone.Home;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import aditishevale.com.instagramclone.R;
import aditishevale.com.instagramclone.Utils.BottomNavigationViewHelper;

public class HomeActivity extends AppCompatActivity {

    private static final String TAG = "HomeActivity";
    private static final int Activity_num= 0;
    private Context mContext = HomeActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d(TAG,"onCreate:Starting");
        setupBottomNavigationView();

    }

    private void setUpViewPager(ViewPager viewPager){
        SectionPagerAdapter adapter = new SectionPagerAdapter(getSupportFragmentManager());

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
