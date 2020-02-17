package bondarenko.samsungit.classwork.fragmentsandviewmodel.ui.adapters;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.Arrays;
import java.util.List;

import bondarenko.samsungit.classwork.fragmentsandviewmodel.ui.fragments.BaseFragment;
import bondarenko.samsungit.classwork.fragmentsandviewmodel.ui.fragments.GreenFragment;
import bondarenko.samsungit.classwork.fragmentsandviewmodel.ui.fragments.MainFragment;
import bondarenko.samsungit.classwork.fragmentsandviewmodel.ui.fragments.RedFragment;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private List<BaseFragment> fragments;

    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
        fragments = Arrays.asList(new RedFragment(), new MainFragment(), new GreenFragment());
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return "RED";
            case 1: return  "BLUE";
            case 2: return "GREEN";
            default: return "";
        }
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
