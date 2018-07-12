package aditishevale.com.instagramclone.Utils;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SectionsStatePagerAdapter extends FragmentPagerAdapter {
    private final List<Fragment> mFragmentList = new ArrayList<>();
    private final HashMap<Fragment,Integer> mFragments = new HashMap<>();
    private final HashMap<String,Integer> mFragmnetNumbers = new HashMap<>();
    private final HashMap<Integer,String> mFragmnetNames = new HashMap<>();

    public SectionsStatePagerAdapter(FragmentManager fm) {
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
    private void addFragment(Fragment fragment ,String fragmentName){
        mFragmentList.add(fragment);
        mFragments.put(fragment,mFragmentList.size()-1);
        mFragmnetNumbers.put(fragmentName,mFragmentList.size()-1);
        mFragmnetNames.put(mFragmentList.size()-1,fragmentName);
    }

    public Integer getFragmentNumber(String fragmentName){
        if (mFragmnetNumbers.containsKey(fragmentName)){
            return mFragmnetNumbers.get(fragmentName);
        }else {
            return null;
        }
    }


    public Integer getFragmentNumber(Fragment fragment){
        if (mFragmnetNumbers.containsKey(fragment)){
            return mFragmnetNumbers.get(fragment);
        }else {
            return null;
        }
    }

    public String getFragmentName(Integer fragmentNumber){
        if (mFragmnetNames.containsKey(fragmentNumber)){
            return mFragmnetNames.get(fragmentNumber);
        }else {
            return null;
        }
    }
}
