package com.example.zll.quer.net;

import com.example.zll.quer.bean.PopBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by zll on 2018/7/19.
 */

public interface PopApiService {
    @GET("quarter/getVideos?uid=12879&type=1&page=1&token=10401FFDCD75934C322C4A5C81931740&source=android&appVersion=101")
    Observable<PopBean> getPopService();
}
