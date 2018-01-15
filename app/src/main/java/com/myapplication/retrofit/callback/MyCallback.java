package com.myapplication.retrofit.callback;

import com.google.gson.Gson;
import com.myapplication.utils.LogUtils;

import java.io.IOException;

import okhttp3.ResponseBody;
import okio.BufferedSource;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Administrator on 2016/9/18.
 */
public abstract class MyCallback<T> implements Callback<T> {
    /**
     * Invoked for a received HTTP response.
     * <p/>
     * Note: An HTTP response may still indicate an application-level failure such as a 404 or 500.
     * Call {@link Response#isSuccessful()} to determine if the response indicates success.
     */
    public void onResponse(Call<T> call, Response<T> response) {
        if(response.isSuccessful()) {
            onResponse(response.body());
        } else {
            ResponseBody responseBody = response.errorBody();
            BufferedSource bufferedSource = responseBody.source();
            try {
                ErrorBean errorBean = new Gson().fromJson(responseBody.source().readUtf8(),ErrorBean.class);
                if(errorBean.getErrorCode() == 10201 || errorBean.getErrorCode() == 10207){
                    // TODO: 2016/9/18  判断是否有token，如果有则刷新
//                    String access_token = SPutils.get(Ckey.Access_token);
//                    if(!TextUtils.isEmpty(access_token)) {
//
//                        main.gethttpRefreshToken();
//                    }

                } else if(errorBean.getErrorCode() == 10403 || errorBean.getErrorCode() == 10404) {
                    // TODO: 2016/9/18  判断刷新token，如果出现跳转登录页面

                } else {
                    onFailure(errorBean);
                }

            } catch (IOException e) {
                LogUtils.e("输出json格式错误");
                e.printStackTrace();
            } finally {
                try {
                    bufferedSource.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }
    }

    public abstract void onResponse(T response);
    public abstract void onFailure(ErrorBean response);

    /**
     * Invoked when a network exception occurred talking to the server or when an unexpected
     * exception occurred creating the request or processing the response.
     */
    public void onFailure(Call<T> call, Throwable t) {
        // TODO: 2016/9/18 网络错误
//        Toast.makeText(main, "网络连接错误", Toast.LENGTH_SHORT).show();
    }
}
