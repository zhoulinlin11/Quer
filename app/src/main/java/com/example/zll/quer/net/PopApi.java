package com.example.zll.quer.net;

import com.example.zll.quer.bean.PopBean;

import io.reactivex.Observable;

/**
 * Created by zll on 2018/7/19.
 */

public class PopApi {
    private static PopApi popApi;
    private PopApiService popApiService;

    public PopApi(PopApiService popApiService) {
        this.popApiService = popApiService;
    }
    public static PopApi getPopApi(PopApiService popApiService){
        if (popApi==null){
            popApi=new PopApi(popApiService);
        }
        return popApi;
    }
    public Observable<PopBean> getPopService(){
        return popApiService.getPopService();
    }
}
