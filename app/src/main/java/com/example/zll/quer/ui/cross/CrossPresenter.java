package com.example.zll.quer.ui.cross;

import com.example.zll.quer.bean.CrossBean;
import com.example.zll.quer.net.CrossApi;
import com.example.zll.quer.ui.base.BasePresenter;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by zll on 2018/7/18.
 */

public class CrossPresenter extends BasePresenter<CrossContract.View> implements CrossContract.Presenter{

    CrossApi crossApi;

    @Inject
    public CrossPresenter(CrossApi crossApi) {
        this.crossApi = crossApi;
    }

    @Override
    public void getCrossPresenter() {
        crossApi.getCromApiService()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<CrossBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(CrossBean crossBean) {
                        if (mView!=null){
                            mView.getCrossView(crossBean);
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
