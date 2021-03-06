package com.example.zll.quer.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.zll.quer.R;
import com.example.zll.quer.ui.video1.pop1.PopFragment;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by zll on 2018/7/17.
 */

public class VideoFragment extends Fragment {
    private View view;
    private TabLayout mTl;
    private ViewPager mVp;
    private List<String> list;
    private List<Fragment> lists;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.videofragment, container, false);
        initView(view);
        list = new ArrayList<>();
          list.add("热门");
          list.add("附近");
        lists = new ArrayList<>();
        lists.add(new PopFragment());
        lists.add(new NearlyFragment());
      mVp.setAdapter(new FragmentPagerAdapter(getChildFragmentManager()) {
          @Nullable
          @Override
          public CharSequence getPageTitle(int position) {
              return list.get(position);
          }

          @Override
          public Fragment getItem(int position) {
              return lists.get(position);
          }

          @Override
          public int getCount() {
              return list.size();
          }
      });
      mTl.setupWithViewPager(mVp);
        return view;
    }

    private void initView(View view) {
        mTl = (TabLayout) view.findViewById(R.id.tl);
        mVp = (ViewPager) view.findViewById(R.id.vp);
    }
}
