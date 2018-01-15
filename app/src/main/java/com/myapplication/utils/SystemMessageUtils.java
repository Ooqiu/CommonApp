package com.myapplication.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.graphics.Point;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;

import com.myapplication.MainActivity;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.UUID;

import static com.myapplication.MainActivity.context;


/**
 *  author：PengHongQiu
 * data: 2017/5/9 17:41
 *  e-mail：18330470538@163.com
 *  
 */
public class SystemMessageUtils {
    /**获取当前系统的android版本号*/
    public static String getCurrentapiVersion(){

//        int currentapiVersion= Build.VERSION.RELEASE;
        String currentapiVersion = Build.VERSION.RELEASE;
        return currentapiVersion;
    }
    /**获取当前app的版本号*/
    public static String getVersionName(Context context){
        String versionName = "";
        try {
            PackageInfo pi = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            versionName = pi.versionName;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return versionName;
    }
    /**当前手机型号*/
    public static String getModelType(){
        String modelType = android.os.Build.MODEL;
        return modelType;
    }
//    /**获取设备唯一标识码 
//     * @param context 上下文 
//     * @return 设备唯一标识码 
//     */ 
//    public static String getUDID(Context context) { 
//        String udid = AppConfig.getUDID(context, null); 
//        if (udid == null || "".equals(udid.trim())) { 
//            TelephonyManager telephonyManager =(TelephonyManager)
//                    context.getSystemService(Context.TELEPHONY_SERVICE); 
//            udid = telephonyManager.getDeviceId(); 
//            if (udid == null || "".equals(udid.trim())) 
//            udid = Build.SERIAL;
//            //非手机设备 
//            if (udid == null || "".equals(udid.trim())) {
//                //两种都获取不到，随机生成 
//                Random random = new Random(); 
//                int rand = random.nextInt(100000); 
//                long curTimeMills = System.currentTimeMillis(); 
//                udid = curTimeMills + "," + rand; 
//            } 
//            AppConfig.setUDID(context, udid); 
//        }  
//        return udid; 
//    }
protected static final String PREFS_FILE = "gank_device_id.xml";
    protected static final String PREFS_DEVICE_ID = "gank_device_id";
    protected static String uuid;
    /**
     * 获取唯一标识码
     * @param mContext
     * @return
     */
    public synchronized static String getUDID(Context mContext)
    {

        if( uuid ==null ) {
            if( uuid == null) {
                final SharedPreferences prefs = mContext.getApplicationContext().getSharedPreferences( PREFS_FILE, Context.MODE_PRIVATE);
                final String id = prefs.getString(PREFS_DEVICE_ID, null );

                if (id != null) {
                    // Use the ids previously computed and stored in the prefs file
                    uuid = id;
                } else {

                    final String androidId = Settings.Secure.getString(mContext.getContentResolver(), Settings.Secure.ANDROID_ID);
                    // Use the Android ID unless it's broken, in which case fallback on deviceId,
                    // unless it's not available, then fallback on a random number which we store
                    // to a prefs file
                    try {
                        if (!"9774d56d682e549c".equals(androidId)) {
                            uuid = UUID.nameUUIDFromBytes(androidId.getBytes("utf8")).toString();
                        } else {
                            @SuppressLint("MissingPermission") final String deviceId = ((TelephonyManager) mContext.getSystemService( Context.TELEPHONY_SERVICE )).getDeviceId();
                            uuid = deviceId!=null ? UUID.nameUUIDFromBytes(deviceId.getBytes("utf8")).toString() : UUID.randomUUID().toString();
                        }
                    } catch (UnsupportedEncodingException e) {
                        throw new RuntimeException(e);
                    }

                    // Write the value out to the prefs file
                    prefs.edit().putString(PREFS_DEVICE_ID, uuid).commit();
                }
            }
        }
        return uuid;
    }
    /**获取屏幕分辨率*/
    public static String getDisplayInfomation() {
        Point point = new Point();
        MainActivity activity = (MainActivity) MainActivity.getInstance();
        activity.getWindowManager().getDefaultDisplay().getSize(point);
        return point.toString();
    }
    /**获取mac*/
    public static String getMac(){
        MainActivity activity = (MainActivity) MainActivity.getInstance();
        @SuppressLint("WifiManagerLeak") WifiManager wifi = (WifiManager) activity.getSystemService (Context.WIFI_SERVICE);
        @SuppressLint("MissingPermission") WifiInfo info = wifi.getConnectionInfo();
        return info.getMacAddress();
    }
    /**
     * 判断应用是否是在后台
     */
    public static boolean isBackground(Context context) {
        ActivityManager activityManager = (ActivityManager) context
                .getSystemService(Context.ACTIVITY_SERVICE);
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService(Context.KEYGUARD_SERVICE);

        List<ActivityManager.RunningAppProcessInfo> appProcesses = activityManager
                .getRunningAppProcesses();
        for (ActivityManager.RunningAppProcessInfo appProcess : appProcesses) {
            if (TextUtils.equals(appProcess.processName, context.getPackageName())) {
                boolean isBackground = (appProcess.importance != ActivityManager.RunningAppProcessInfo.IMPORTANCE_FOREGROUND && appProcess.importance != ActivityManager.RunningAppProcessInfo.IMPORTANCE_VISIBLE);
                boolean isLockedState = keyguardManager.inKeyguardRestrictedInputMode();
                return isBackground || isLockedState;
            }
        }
        return false;
    }

    public static int getVersionCode(){
        int versionCode = 0;
        try {
            PackageInfo pi = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            versionCode = pi.versionCode;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return versionCode;
    }
    //获取手机品牌
    public static String getPhoneType(){
        return Build.BRAND;
    }
//       public String getProvidersName() {  
//        String ProvidersName = null;  
//        // 返回唯一的用户ID;就是这张卡的编号神马的  
//        IMSI = telephonyManager.getSubscriberId();  
//        // IMSI号前面3位460是国家，紧接着后面2位00 02是中国移动，01是中国联通，03是中国电信。  
//        System.out.println(IMSI);  
//        if (IMSI.startsWith("46000") || IMSI.startsWith("46002")) {  
//            ProvidersName = "中国移动";  
//        } else if (IMSI.startsWith("46001")) {  
//            ProvidersName = "中国联通";  
//        } else if (IMSI.startsWith("46003")) {  
//            ProvidersName = "中国电信";  
//        }  
//        return ProvidersName;  
//    } 
    //获取网络运营商
    public static String getProvidersName(){
        String providersName = null;
        //返回唯一的用户ID；就是这行卡的编号什么的
        TelephonyManager telePhoneManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        String IMSI = telePhoneManager.getSimOperator();
        if(IMSI != null) {
        if(IMSI.equals("46000")|| IMSI.equals("46002")) {
            providersName = "中国移动";
        }else if(IMSI.equals("46001")) {
            providersName = "中国联通";
        }else if(IMSI.startsWith("46003")) {
            providersName = "中国电信";
        }
        }
        return providersName;
    }
    //os版本号
    public static String getRelease(){
        return "android";
    }
}
