package com.example.zll.quer.net;

import com.example.zll.quer.bean.RecomBean;

import io.reactivex.Observable;

/**
 * Created by zll on 2018/7/17.
 */

public class RecomApi {
    private static RecomApi recomApi;
    private RecomApiService recomApiService;

    public RecomApi(RecomApiService recomApiService) {
        this.recomApiService = recomApiService;
    }
    public static RecomApi getRecomApi(RecomApiService recomApiService){
        if (recomApi==null){
            recomApi=new RecomApi(recomApiService);
        }
       return recomApi;
    }
    public Observable<RecomBean> gethot(){
        return recomApiService.gethot();
    }
}
