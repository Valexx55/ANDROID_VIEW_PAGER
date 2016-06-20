package com.example.vale.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PageAdapterPropio extends FragmentStatePagerAdapter {

    public PageAdapterPropio(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;

       switch (position)
       {
           case 0: fragment = new ScreenFragment1();
               break;
           default: fragment = new ScreenFragment2();
       }

        return  fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }

}
