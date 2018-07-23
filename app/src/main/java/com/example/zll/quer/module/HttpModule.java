package com.example.zll.quer.module;
import com.example.zll.quer.net.Api;
import com.example.zll.quer.net.CrossApi;
import com.example.zll.quer.net.CrossApiService;

import com.example.zll.quer.net.PopApi;
import com.example.zll.quer.net.PopApiService;
import com.example.zll.quer.net.RecomApi;
import com.example.zll.quer.net.RecomApiService;

import java.util.concurrent.TimeUnit;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by zll on 2018/7/17.
 */
@Module
public class HttpModule {
    @Provides
    OkHttpClient.Builder proviteOkHttpClient(){
        return new OkHttpClient.Builder()
                .connectTimeout(10,TimeUnit.SECONDS)
                .writeTimeout(15,TimeUnit.SECONDS)
                .readTimeout(15,TimeUnit.SECONDS);
    }
    @Provides
    RecomApi proviteRecomApi(OkHttpClient.Builder builder){
        Retrofit build = new Retrofit.Builder()
                .baseUrl(Api.xiangmu)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(builder.build())
                .build();
        RecomApiService recomApiService = build.create(RecomApiService.class);
        return RecomApi.getRecomApi(recomApiService);
    }
    @Provides
    CrossApi proviteCrossApi(OkHttpClient.Builder builder){
        Retrofit build = new Retrofit.Builder()
                .baseUrl(Api.xiangmu)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(builder.build())
                .build();
        CrossApiService crossApiService = build.create(CrossApiService.class);
        return CrossApi.getCrossApi(crossApiService);
    }
    @Provides
    PopApi provitePopService(OkHttpClient.Builder builder){
        Retrofit retrofit= new Retrofit.Builder()
                .baseUrl(Api.xiangmu)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(builder.build())
                .build();
        PopApiService popApiService = retrofit.create(PopApiService.class);
        return PopApi.getPopApi(popApiService);
    }



}
