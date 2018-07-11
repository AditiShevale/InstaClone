package aditishevale.com.instagramclone.Profile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

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
        setContentView(R.layout.activity_profile);

        setupBottomNavigationView();
        setupToolbar();
    }
        /*Set Up ToolBar Widget*/

        private void setupToolbar(){
            Toolbar toolbar = (Toolbar)findViewById(R.id.profileToolBar);
            setSupportActionBar(toolbar);
            ImageView profileMenu = (ImageView) findViewById(R.id.profileMenu);
            profileMenu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext,AccountSettingsActivity.class);
                    startActivity(intent);
                }
            });
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
