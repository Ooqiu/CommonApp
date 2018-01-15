package com.myapplication.base;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.StrictMode;


public class BaseApplication extends Application {
	private static Context mContext;
	private static Handler mMainHandler;
	private static int mMainThreadId;
	private static Thread mMainThread;
//	private OkHttpClient mClient;
//	private static PersistentCookieStore mCookieStore;
	public static String AgencID;

	// 需要改成给您的 appKey 还有keySecret
	// 京东开普勒
	public static final String appKey = "2a49d942596e4f35ba69557b72e78d79";
	public static final String keySecret = "186863adf6c34ca5a0d90832cf724905";
	@Override
	public void onCreate() {
		super.onCreate();
		mContext = this;
		mMainHandler = new Handler();
		mMainThreadId = android.os.Process.myTid();
		mMainThread = Thread.currentThread();
		//initOkhttpClient();
		// 文件夹写入错误日志
		// CrashHandler.getInstance().init(this);
//		ViewTarget.setTagId(R.id.glide_tag);
		//android7.0更新apk闪退
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
			StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
			StrictMode.setVmPolicy(builder.build());
		}
	}


//	private void initOkhttpClient() {
//		mCookieStore = new PersistentCookieStore(mContext);
//		mClient = OkHttpUtils.getInstance().getOkHttpClient();
//		mClient.setConnectTimeout(5, TimeUnit.SECONDS);
//		mClient.setCookieHandler(new CookieManager(mCookieStore,
//				CookiePolicy.ACCEPT_ALL));
//	}


	public static Handler getMainHandler() {
		return mMainHandler;
	}

	public static Context getContext() {
		return mContext;
	}
	/** 获取主线程ID */
	public static int getMainThreadId() {
		return mMainThreadId;
	}

	public static Thread getMainThread() {
		return mMainThread;
	}

//	public static PersistentCookieStore getCookieStore() {
//		return mCookieStore;
//	}

	@Override
	protected void attachBaseContext(Context base) {
		super.attachBaseContext(base);
//		MultiDex.install(this);
	}
//	private String[] getStringArr(){
//		/**当前系统版本*/
//		String currentapiVersion = SystemMessageUtils.getCurrentapiVersion();
//		/**获取当前app的版本号*/
//		String versionName = SystemMessageUtils.getVersionName(getContext());
//		/**手机udid*/
//		String udid = SystemMessageUtils.getUDID(getContext());
//		/**获取手机设备类型*/
//		String modelType = SystemMessageUtils.getModelType();
//		/**获取屏幕分辨率*/
//		String displayInfomation = SystemMessageUtils.getDisplayInfomation();
//		/**获取mac地址*/
//		String mac = SystemMessageUtils.getMac();
//		String[] str = {currentapiVersion,versionName,udid,modelType,displayInfomation,mac};
//		return str;
//	}
//	/**获取屏幕分辨率*/
//	private String getDisplayInfomation() {
//		Point point = new Point();
//		MainActivity activity = (MainActivity) getContext();
//		activity.getWindowManager().getDefaultDisplay().getSize(point);
//		return point.toString();
//	}
}
