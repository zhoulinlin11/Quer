package com.example.zll.quer.ui.recom.hot;


import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import android.util.Log;
import android.view.View;


import com.example.zll.quer.DaggerPenoent;
import com.example.zll.quer.R;
import com.example.zll.quer.bean.RecomBean;
import com.example.zll.quer.ui.base.BaseFragment;
import com.example.zll.quer.utils.GlidImageLoder;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zll on 2018/7/17.
 */

public class HotFragment extends BaseFragment<HotPresenter> implements HotContract.View {
    private Banner mBanner;
    private RecyclerView mRlv;

    @Override
    public int ContentLayout() {
        return R.layout.hotfragment;
    }

    @Override
    public void initView(View view) {
        mBanner = (Banner) view.findViewById(R.id.banner);
        mRlv = (RecyclerView) view.findViewById(R.id.rlv);
        //设置图片加载器
        mBanner.setImageLoader(new GlidImageLoder());
        mRlv.setLayoutManager(new LinearLayoutManager(getActivity()));

        mPresenter.hotPresenter();
        List<String> list=new ArrayList<>();
        list.add("https://www.zhaoapi.cn/images/quarter/ad1.png");
        list.add("https://www.zhaoapi.cn/images/quarter/ad2.png");
        list.add("https://www.zhaoapi.cn/images/quarter/ad3.png");
        list.add("https://www.zhaoapi.cn/images/quarter/ad4.png");
       /* List<String> list1=new ArrayList<>();
        list1.add(list.get(0).concat("第十三界瑞丽模特大赛"));
        list1.add("文化艺术节");
        list1.add("直播封面标准");
        list1.add("人气谁最高，金主谁最豪气");*/
        //获取图片
        mBanner.setImages(list);
        //mBanner.setBannerTitles(list1);
        //轮播开始
        mBanner.start();

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mBanner.stopAutoPlay();
    }
    @Override
    public void inject() {
        DaggerPenoent.builder()
                .build()
                .inject(this);
    }

    @Override
    public void hotView(RecomBean recomBean) {
        List<RecomBean.DataBean> data = recomBean.getData();
       mRlv.setAdapter(new HotAdapter(data,getActivity()));
    }
}
