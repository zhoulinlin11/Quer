package com.example.zll.quer.net;

import com.example.zll.quer.bean.CrossBean;

import io.reactivex.Observable;

/**
 * Created by zll on 2018/7/17.
 */

public class CrossApi {
    private static CrossApi crossApi;
    private CrossApiService crossApiService;

    public CrossApi(CrossApiService crossApiService) {
        this.crossApiService = crossApiService;
    }

    public static CrossApi getCrossApi(CrossApiService crossApiService){
        if (crossApi==null){
            crossApi=new CrossApi(crossApiService);
        }
        return crossApi;
    }

    public Observable<CrossBean> getCromApiService(){
        return crossApiService.getCrossService();
    }
}
