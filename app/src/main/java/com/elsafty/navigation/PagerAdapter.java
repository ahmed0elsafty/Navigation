package com.elsafty.navigation;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

class PagerAdapter extends FragmentStatePagerAdapter {
    int mcount;

    public PagerAdapter(FragmentManager fm, int count) {
        super(fm);
        mcount = count;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                return new FirstFragment();
            case 1:
                return new SecondFragment();
            case 2:
                return new ThirdFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return mcount;
    }
}
