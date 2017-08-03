package retrofit.mifeng.us.mytablayout;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by 21903 on 2017/8/3.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    String s[];
    Context context;
    ArrayList<Fragment> f=new ArrayList<>();
    //重写构造方法
    public SimpleFragmentPagerAdapter(FragmentManager fm,ArrayList<Fragment> f,String s[],Context context) {
        super(fm);
        this.context=context;
        this.f=f;
        this.s=s;
    }

    @Override
    public Fragment getItem(int position) {
        return f.get(position);
    }

    @Override
    public int getCount() {
        return s.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return s[position];
    }
}
