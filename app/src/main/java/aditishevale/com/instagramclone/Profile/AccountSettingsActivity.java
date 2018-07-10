package aditishevale.com.instagramclone.Profile;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import aditishevale.com.instagramclone.R;

class AccountSettingsActivity extends AppCompatActivity {
    private  static final String TAG ="AccountSettingsAcitvity";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_setting);
    }
}
