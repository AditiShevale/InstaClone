package aditishevale.com.instagramclone.Profile;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

import aditishevale.com.instagramclone.R;

public class AccountSettingsActivity extends AppCompatActivity {

    private  static final String TAG ="AccountSettingsAcitvity";
    private Context mContext;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_setting);
        mContext =AccountSettingsActivity.this;
        Log.d(TAG,"onCreate: started");
        setUpSettingsList();

        // Setup Back Button for Navigating "Profile Activity"

        ImageView backarrow = (ImageView)findViewById(R.id.backArrow);
        backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }


    private void setUpSettingsList(){

        ListView listView = (ListView)findViewById(R.id.lvAccountSettings);

        ArrayList<String> options = new ArrayList<>();
        options.add(getString(R.string.edit_profile));
        options.add(getString(R.string.sign_out));
        Log.d(TAG,"SetUpSetting");

        ArrayAdapter adapter = new ArrayAdapter(mContext,
                android.R.layout.simple_list_item_1, options);
        listView.setAdapter(adapter);

    }
}
