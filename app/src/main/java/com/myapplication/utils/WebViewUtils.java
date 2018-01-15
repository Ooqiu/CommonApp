package com.myapplication.utils;

import android.app.Activity;
import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import android.webkit.WebView;

/**
 *  author：PengHongQiu
 * data: 2017/1/18 17:35
 *  e-mail：18330470538@163.com
 *  
 */
public class WebViewUtils {
    public static void goBack(WebView webView, Activity activity){
        if(webView.canGoBack()) {
            webView.goBack();
        }else{
            activity.finish();
        }
    }

    public static void setWebView(WebSettings settings) {
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);
        settings.setUseWideViewPort(false);
        settings.setLoadWithOverviewMode(true);
        settings.setCacheMode(WebSettings.LOAD_NO_CACHE);
        settings.setAllowFileAccess(true);
        settings.setAppCacheEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setBlockNetworkImage(false);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);  //居中显示
        settings.setDefaultTextEncodingName("UTF-8"
        );
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            settings.setMixedContentMode(
                    WebSettings.MIXED_CONTENT_COMPATIBILITY_MODE);
        }
//            settings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);

    }
    public static void removeAllCookie(WebView webView){
        CookieSyncManager cookieSyncManager = CookieSyncManager.createInstance(webView.getContext());
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        cookieManager.removeSessionCookie();
        cookieManager.removeAllCookie();
        cookieSyncManager.sync();
    }
    //加快HTML网页装载完成的速度
    public static void setWebViewImage (WebView webView) {
        if(Build.VERSION.SDK_INT >= 19) {
            webView.getSettings().setLoadsImagesAutomatically(true);
        } else {
            webView.getSettings().setLoadsImagesAutomatically(false);
        }
    }

}
