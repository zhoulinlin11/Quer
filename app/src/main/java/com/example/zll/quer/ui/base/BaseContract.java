package com.example.zll.quer.ui.base;

/**
 * Created by zll on 2018/7/9.
 * 抽取p层和v层的公共方法
 */

public interface BaseContract {
    interface BaseView{
    }
    //p层和ArrayList进行交互
    interface BasePresenter<T extends BaseView>{
        void attachView(T view);
        void detachView();
    }
}
