package lib.jacob.org.jbigandroid.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import lib.jacob.org.jbigandroid.fragment.PaintViewFragment;

/**
 * Created by moses on 8/27/15.
 */
public class FragmentViewAdapter extends FragmentPagerAdapter {

    public FragmentViewAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment= null;

        switch (position) {
            case 0:
                fragment = PaintViewFragment.newInstance(null, null);
                break;
            default:
                break;
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 1;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;

        switch (position) {
            case 0:
                title = "Paint";
                break;
            default:
                title = null;
                break;
        }

        return title;
    }

}