package com.example.androidku;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

//20-mei-2019
// Nim 10116314
// nama : Sabadi Dwiputra
// kelas : IF-7

public class PageAdapter extends FragmentPagerAdapter {

    private int numOfTabs;

    PageAdapter(FragmentManager fm,int numOfTabs) {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 :
                return new BerandaFragment();
            case 1:
                return new ProfileFragment();
            case 2:
                return new MedFragment();
                default:
                    return null;
        }

    }
    @Override
    public int getCount() {
        return numOfTabs;
    }
}
