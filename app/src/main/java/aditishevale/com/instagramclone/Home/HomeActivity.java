package aditishevale.com.instagramclone.Home;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TableLayout;

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
        setUpViewPager();

    }

        /* Responsible for adding 3 tabs: Camera,Home,Messages */

    private void setUpViewPager(){
        SectionPagerAdapter adapter = new SectionPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new CameraFragment());
        adapter.addFragment(new HomeFragment());
        adapter.addFragment(new MessagesFragment());
        ViewPager viewPager = (ViewPager)findViewById(R.id.container);
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_camera);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_action_name);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_arrow);
    }

         /* Method For Setting BottomNavigation*/

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
