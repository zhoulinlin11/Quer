package com.example.zll.quer.ui.recom.hot;

import com.example.zll.quer.bean.RecomBean;
import com.example.zll.quer.net.RecomApi;
import com.example.zll.quer.ui.base.BasePresenter;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by zll on 2018/7/17.
 */

public class HotPresenter extends BasePresenter<HotContract.View> implements HotContract.Presenter{

    RecomApi recomApi;
    @Inject
    public HotPresenter(RecomApi recomApi) {
        this.recomApi = recomApi;
    }

    @Override
    public void hotPresenter() {
        recomApi.gethot()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<RecomBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(RecomBean recomBean) {
                        if (mView!=null){
                            mView.hotView(recomBean);
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
