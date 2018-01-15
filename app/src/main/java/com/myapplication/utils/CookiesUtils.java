package com.myapplication.utils;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;

/**
 *  author：PengHongQiu
 * data: 2017/2/8 11:31
 *  e-mail：18330470538@163.com
 *  
 */
public class CookiesUtils {

    public static boolean setCookies(Context context, String cookie, String url){
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
            CookieSyncManager.createInstance(context);
        }

        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        cookieManager.removeSessionCookie();
        cookieManager.setCookie(url, cookie);//如果没有特殊需求，这里只需要将session id以"key=value"形式作为cookie即可
        String newCookie = cookieManager.getCookie(url);
//        LogUtils.e(newCookie);
        return TextUtils.isEmpty(newCookie)?false:true;

    }

    public static String getCookies(String url) {
        CookieManager cookieManager = CookieManager.getInstance();
        String CookieStr = cookieManager.getCookie(url);
        return CookieStr;
    }
}
