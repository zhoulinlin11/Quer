package com.example.zll.quer.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


import com.example.zll.quer.utils.IBase;

import javax.inject.Inject;

/**
 * Created by zll on 2018/7/9.
 */

public abstract class BaseActivtiy<T extends BaseContract.BasePresenter> extends AppCompatActivity implements IBase,BaseContract.BaseView {

    @Inject
    protected T mPresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(ContentLayout());
        inject();
        mPresenter.attachView(this);
    }
    @Override
    public void initView(View view) {

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mPresenter.detachView();
    }
}
