package project.ap.com.sidenavbuttomnavtopfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int numberofTabs;

    public PagerAdapter(FragmentManager fm, int tabsCount) {
        super(fm);
        this.numberofTabs = tabsCount;
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Tab1();

            case 1:
                return new Tab2();
        }
        return null;
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return numberofTabs;
    }
}
