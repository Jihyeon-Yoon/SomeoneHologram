package com.ssy.graduationwork.someonehologram;


import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TabLayout + ViewPager
        // TabLayout을 쓰기 위해서 build.gradle(Module: app)의 dependencies에 디자인 라이브러리 추가
        TabLayout tabLayout = findViewById(R.id.tabLayout);

        ViewPager viewPager = findViewById(R.id.viewPager);

        Fragment[] arrFragments = new Fragment[4];
        arrFragments[0] = new TimeFragment();
        arrFragments[1] = new WeatherFragment();
        arrFragments[2] = new PlantFragment();
        arrFragments[3] = new MusicFragment();

        MyPagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager(), arrFragments);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    private class MyPagerAdapter extends FragmentPagerAdapter {
        private Fragment[] arrFragments;

        public MyPagerAdapter(FragmentManager fm, Fragment[] arrFragments) {
            super(fm);
            this.arrFragments = arrFragments;
        }

        @Override
        public Fragment getItem(int position) {
            return arrFragments[position];
        }

        @Override
        public int getCount() {
            return arrFragments.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch(position) {
                case 0:
                    return "Time";
                case 1:
                    return "Weather";
                case 2:
                    return "Plant";
                case 3:
                    return "Music";
                default:
                    return "";
            }
        }
    }


}
