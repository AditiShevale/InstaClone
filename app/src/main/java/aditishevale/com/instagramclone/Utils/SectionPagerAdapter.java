package aditishevale.com.instagramclone.Utils;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/*Class that Stores fragment for tabs*/

public class SectionPagerAdapter extends FragmentPagerAdapter {

    private static final String TAG = "SectionsPagerAdapter";

    private final List<Fragment> mFragmentList = new ArrayList<>();

    public SectionPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        return mFragmentList.get(position);
    }


    @Override
    public int getCount() {

        return mFragmentList.size();
    }


/*    To Add Fragment*/

    public void addFragment(Fragment fragment){

        mFragmentList.add(fragment);
    }
}
