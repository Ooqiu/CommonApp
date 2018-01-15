package com.myapplication.retrofit;

import android.text.TextUtils;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/**
 * Created by Administrator on 2016/9/18.
 * 拦截器
 */
public class AuthorizationInterceptor implements Interceptor {
//        private Context context;
//        public AuthorizationInterceptor(Context context) {
//            super();
//            this.context = context;
//
//        }

//        @Override
//        public Response intercept(Chain chain) throws IOException {
//
//            Response originalResponse = chain.proceed(chain.request());
//            //这里获取请求返回的cookie
//            if (!originalResponse.headers("Set-Cookie").isEmpty()) {
//                final StringBuffer cookieBuffer = new StringBuffer();
//                //最近在学习RxJava,这里用了RxJava的相关API大家可以忽略,用自己逻辑实现即可.大家可以用别的方法保存cookie数据
//                Observable.from(originalResponse.headers("Set-Cookie"))
//                        .map(new Func1<String, String>() {
//                            @Override
//                            public String call(String s) {
//                                String[] cookieArray = s.split(";");
//                                String cookies = "";
//                                for(int i = 0; i < cookieArray.length; i++) {
//                                    cookies += cookieArray[i] + ";";
//                                }
////                                return cookieArray[0];
////                                if(TextUtils.isEmpty(SPutils.get(CommonActivity.COOKIES))) {
////                                    SPutils.put(CommonActivity.COOKIES,cookies);
////                                }
//                                return cookies;
//                            }
//                        })
//                        .subscribe(new Action1<String>() {
//                            @Override
//                            public void call(String cookie) {
//                                cookieBuffer.append(cookie).append(";");
//                            }
//                        });
//            }
//
//            return originalResponse;
//
//    }
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();

        String authorization = request.header("Authorization");
        if (TextUtils.isEmpty(authorization)){
//            if (!StringUtils.isEmpty(SPutils.get(Ckey.Access_token))){
//                request = request.newBuilder().header("Authorization","Bearer " + SPutils.get(Ckey.Access_token)).build();
//                return chain.proceed(request);
//            }
        }
        Response response = chain.proceed(request);
        ResponseBody responseBody = response.body();
        return response;
    }

}
