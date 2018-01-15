package com.myapplication.retrofit.service;


import com.myapplication.bean.HomePageBean;

import retrofit2.http.GET;
import rx.Observable;

/**
 *  author：PengHongQiu
 * data: 2017/12/6 10:21
 *  e-mail：18330470538@163.com
 *  
 */
public interface ArticleService {
    @GET("/app/queryAppIndexPage.json?android=android")
    Observable<HomePageBean> getList();
}
