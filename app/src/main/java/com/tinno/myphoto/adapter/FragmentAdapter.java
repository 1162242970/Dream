package com.tinno.myphoto.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.tinno.myphoto.R;
import com.tinno.myphoto.activity.MainActivity;

import java.util.List;

/**
 * Created by android on 17-11-28.
 */

    public class FragmentAdapter extends FragmentPagerAdapter {

    private Context context;
    private List<Fragment> list;
    public FragmentAdapter(FragmentManager fm, Context context, List list) {
        super(fm);
        this.context = context;
        this.list = list;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    /**
     * 自定义方法，提供自定义Tab
     *
     * @param position 位置
     * @return 返回Tab的View
     */

}
