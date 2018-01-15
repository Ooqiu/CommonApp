package com.myapplication.retrofit;


import com.myapplication.interf.Url;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2016/9/17.
 */
public class RetrofitClient {
    //所有的联网地址 统一成https

    public static <S> S createService(Class<S> serviceClass) {
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.connectTimeout(10, TimeUnit.SECONDS);
        httpClient.writeTimeout(10, TimeUnit.SECONDS);
        httpClient.readTimeout(30, TimeUnit.SECONDS);
        httpClient.retryOnConnectionFailure(true);
        httpClient.addNetworkInterceptor(new AuthorizationInterceptor());
        //适配器
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .baseUrl(Url.URL).client(httpClient.build())
                .build();
        return retrofit.create(serviceClass);
    }
}
