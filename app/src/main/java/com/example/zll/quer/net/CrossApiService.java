package com.example.zll.quer.net;

import com.example.zll.quer.bean.CrossBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by zll on 2018/7/17.
 */

public interface CrossApiService {
    @GET("quarter/getJokes?page=1&source=android&appVersion=101&token=10401FFDCD75934C322C4A5C81931740")
    Observable<CrossBean> getCrossService();
}
