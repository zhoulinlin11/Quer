package com.example.zll.quer.ui.base;

/**
 * Created by zll on 2018/7/9.
 */

public class BasePresenter<T extends BaseContract.BaseView> implements BaseContract.BasePresenter<T> {
    public T mView;
    //解决内存溢出
    @Override
    public void attachView(T view) {
        if (view!=null){
            this.mView=view;
        }
    }

    @Override
    public void detachView() {
     if (mView!=null){
         mView=null;
     }
    }
}
