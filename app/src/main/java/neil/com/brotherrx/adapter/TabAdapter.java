package neil.com.brotherrx.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * @author neil
 * @date 2017/12/6
 */

public class TabAdapter extends FragmentPagerAdapter {

    private List<Fragment> mDatas;
    private List<String> titles;

    public TabAdapter(FragmentManager fm, List<Fragment> mDatas, List<String> titles) {
        super(fm);
        this.mDatas = mDatas;
        this.titles = titles;
    }

    public TabAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }
}
