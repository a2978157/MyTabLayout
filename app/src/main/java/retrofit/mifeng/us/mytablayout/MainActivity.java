package retrofit.mifeng.us.mytablayout;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

/**
 * http://www.jcodecraeer.com/a/anzhuokaifa/androidkaifa/2015/0731/3247.html
 */

public class MainActivity extends AppCompatActivity {
    ArrayList<Fragment> f=new ArrayList<>();
    String s[]={"f1","f2","f3"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        //new出3个Fragment
        PageFragment pageFragment = new PageFragment();
        PageFragment2 pageFragment2 = new PageFragment2();
        PageFragment3 pageFragment3 = new PageFragment3();
        //往集合添加Fragmgnt
        f.add(pageFragment);
        f.add(pageFragment2);
        f.add(pageFragment3);
        //实现适配器传4个参数，第一个是碎片管理器，第二个是存Fragment的集合，第三个是标题的数组，第四个是上下文
        SimpleFragmentPagerAdapter simpleFragmentPagerAdapter = new SimpleFragmentPagerAdapter(getSupportFragmentManager(),f,s, this);
        ViewPager vp = (ViewPager) findViewById(R.id.vp);
        //ViewPager添加适配器
        vp.setAdapter(simpleFragmentPagerAdapter);
        TabLayout tab = (TabLayout) findViewById(R.id.tab);
        //TabLayout添加ViewPager
        tab.setupWithViewPager(vp);
        //设置TabLayout模式
        tab.setTabMode(TabLayout.MODE_FIXED);
    }
}
