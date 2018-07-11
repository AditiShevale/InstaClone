package aditishevale.com.instagramclone.Profile;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

import aditishevale.com.instagramclone.R;

public class AccountSettingsActivity extends AppCompatActivity {

    private  static final String TAG ="AccountSettingsAcitvity";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_setting);

        Log.d(TAG,"onCreate: started");
    }
    private void setUpSettingsList(){
        ListView listView = (ListView)findViewById(R.id.lvAccountSettings);

        ArrayList<String> options = new ArrayList<>();
        options.add(getString(R.string.edit_profile));
        options.add(getString(R.string.sign_out));

    }
}
