package com.example.zll.quer.ui.video1.pop1;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.zll.quer.DaggerPenoent;
import com.example.zll.quer.R;
import com.example.zll.quer.bean.PopBean;
import com.example.zll.quer.ui.base.BaseFragment;

import java.util.List;

/**
 * Created by zll on 2018/7/19.
 */

public class PopFragment extends BaseFragment<PopPresenter> implements PopContract.View {
    private RecyclerView mPopRlv;
    @Override
    public int ContentLayout() {
        return R.layout.popfragment;
    }

    @Override
    public void initView(View view) {

        mPopRlv = (RecyclerView) view.findViewById(R.id.pop_rlv);
        mPopRlv.setLayoutManager(new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL));
        //mPresenter.popPresenter();
    }

    @Override
    public void inject() {
        DaggerPenoent.builder()
                .build()
                .inject(this);
    }

    @Override
    public void popview(PopBean popBean) {
        List<PopBean.DataBean> data = popBean.getData();
        mPopRlv.setAdapter(new PopAdapter(data,getActivity()));
    }
}
