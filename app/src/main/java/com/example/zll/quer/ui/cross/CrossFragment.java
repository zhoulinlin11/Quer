package com.example.zll.quer.ui.cross;


import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import android.view.View;


import com.example.zll.quer.DaggerPenoent;
import com.example.zll.quer.R;
import com.example.zll.quer.bean.CrossBean;
import com.example.zll.quer.module.HttpModule;
import com.example.zll.quer.ui.base.BaseFragment;
import java.util.List;

/**
 * Created by zll on 2018/7/17.
 */

public class CrossFragment extends BaseFragment<CrossPresenter> implements CrossContract.View {

    private RecyclerView mCrossRlv;

    @Override
    public int ContentLayout() {
        return R.layout.crossfragment;
    }

    @Override
    public void initView(View view) {
        mCrossRlv = (RecyclerView) view.findViewById(R.id.cross_rlv);
        mPresenter.getCrossPresenter();
        mCrossRlv.setLayoutManager(new LinearLayoutManager(getActivity()));
        mCrossRlv.addItemDecoration(new DividerItemDecoration(getContext(),LinearLayoutManager.VERTICAL));
    }

    @Override
    public void inject() {
        DaggerPenoent.builder()
                .httpModule(new HttpModule())
                .build()
                .inject(this);
    }

    @Override
    public void getCrossView(CrossBean crossBean) {
        mCrossRlv.addItemDecoration(new DividerItemDecoration(getContext(),LinearLayoutManager.VERTICAL));
        List<CrossBean.DataBean> data = crossBean.getData();
        mCrossRlv.setAdapter(new CrossAdapter(data,getActivity()));
    }


}

