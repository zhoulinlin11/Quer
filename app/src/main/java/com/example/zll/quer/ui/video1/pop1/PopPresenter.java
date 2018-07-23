package com.example.zll.quer.ui.video1.pop1;

import com.example.zll.quer.bean.PopBean;
import com.example.zll.quer.net.PopApi;
import com.example.zll.quer.ui.base.BasePresenter;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by zll on 2018/7/19.
 */

public class PopPresenter extends BasePresenter<PopContract.View> implements PopContract.Presenter {

    PopApi popApi;

    @Inject
    public PopPresenter(PopApi popApi) {
        this.popApi = popApi;
    }

    @Override
    public void popPresenter() {
     popApi.getPopService()
             .observeOn(AndroidSchedulers.mainThread())
             .subscribeOn(Schedulers.io())
             .subscribe(new Observer<PopBean>() {
                 @Override
                 public void onSubscribe(Disposable d) {

                 }

                 @Override
                 public void onNext(PopBean popBean) {
                   if (mView!=null){
                       mView.popview(popBean);
                   }
                 }

                 @Override
                 public void onError(Throwable e) {

                 }

                 @Override
                 public void onComplete() {

                 }
             });
    }
}
