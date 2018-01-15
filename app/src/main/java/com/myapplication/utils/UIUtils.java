package com.myapplication.utils;


import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.myapplication.base.BaseApplication;


/**
 * @author Created by ZQC on 2015年12月30日
 */
public class UIUtils {
	private static Toast toast;

	/** 获取Context */
	public static Context getContext() {
		return BaseApplication.getContext();
	}

	/** 获取主线程的handler */
	public static Handler getHandler() {
		return BaseApplication.getMainHandler();
	}

	/** 延时在主线程执行runnable */
	public static boolean postDelayed(Runnable runnable, long delayMillis) {
		return getHandler().postDelayed(runnable, delayMillis);
	}

	/** 在主线程执行runnable */
	public static boolean post(Runnable runnable) {
		return getHandler().post(runnable);
	}

	/** 从主线程looper里面移除runnable */
	public static void removeCallbacks(Runnable runnable) {
		getHandler().removeCallbacks(runnable);
	}

	/** dip转换px */
	public static int dip2px(int dip) {
		final float scale = getContext().getResources().getDisplayMetrics().density;
		return (int) (dip * scale + 0.5f);
	}

	/** pxz转换dip */
	public static int px2dip(int px) {
		final float scale = getContext().getResources().getDisplayMetrics().density;
		return (int) (px / scale + 0.5f);
	}

	public static View inflate(int resId) {
		return LayoutInflater.from(getContext()).inflate(resId, null);
	}

	/** 获取资源 */
	public static Resources getResources() {
		return getContext().getResources();
	}

	/** 获取文字 */
	public static String getString(int resId) {
		return getResources().getString(resId);
	}

	/** 获取文字数组 */
	public static String[] getStringArray(int resId) {
		return getResources().getStringArray(resId);
	}

	/** 获取dimen */
	public static int getDimens(int resId) {
		return getResources().getDimensionPixelSize(resId);
		// return getResources().getDimension(id);
	}

	/** 获取drawable */
	public static Drawable getDrawable(int resId) {
		return getResources().getDrawable(resId);
	}

	/** 获取颜色 */
	public static int getColor(int resId) {
		return getResources().getColor(resId);
	}

	/** 获取颜色选择器 */
	public static ColorStateList getColorStateList(int resId) {
		return getResources().getColorStateList(resId);
	}

	public static Thread getMainThread() {
		return BaseApplication.getMainThread();
	}

	public static long getMainThreadId() {
		return BaseApplication.getMainThreadId();
	}

	public static boolean isRunInMainThread() {
		return android.os.Process.myTid() == getMainThreadId();
	}



//	/** 开启包裹Fragment的Activity */
//	public static void startActivity(Class<?> cls) {
//		if (Fragment.class.isAssignableFrom(cls)) {
//			Intent intent = new Intent(getContext(), CommonActivity.class);
//			intent.putExtra("fragment", cls);
//			startActivity(intent);
//		} else {
//			throw new IllegalArgumentException(
//					"the Class cls may be not Fragment.class");
//		}
//
//	}
//
//	/** 开启包裹Fragment的Activity,可传递参数 */
//	public static void startActivity(Class<?> cls, Intent i) {
//		if (Fragment.class.isAssignableFrom(cls)) {
//			Intent intent = new Intent(getContext(), CommonActivity.class);
//			intent.putExtra("fragment", cls);
//			if (i != null) {
//				intent.putExtras(i);
//			}
//			startActivity(intent);
//		} else {
//			throw new IllegalArgumentException(
//					"the Class cls may be not Fragment.class");
//		}
//	}


//
//	/** 开启包裹Fragment的Activity,可得到返回值 */
//	public static void startActivityForResult(Class<?> cls, Intent i,
//			int requestCode) {
//		if (Fragment.class.isAssignableFrom(cls)) {
//			Intent intent = new Intent(getContext(), CommonActivity.class);
//			intent.putExtra("fragment", cls);
//			if (i != null) {
//				intent.putExtras(i);
//			}
//			BaseActivity.getForegroundActivity().startActivityForResult(intent,
//					requestCode);
//		} else {
//			throw new IllegalArgumentException(
//					"the Class cls may be not Fragment.class");
//		}
//	}

	/** 获取屏幕高度 */
	public static int getScreenHeight() {
		return getWindowManager().getDefaultDisplay().getHeight();
	}

	public static int getScreenWidth() {
		return getWindowManager().getDefaultDisplay().getWidth();
	}

	private static WindowManager getWindowManager() {
		return (WindowManager) getContext().getSystemService(
				Context.WINDOW_SERVICE);
	}


	/** 显示吐司 */
	public static void showToast(Context context,String str) {
		if (toast == null) {
			toast = Toast.makeText(context, str, Toast.LENGTH_SHORT);
		}
		toast.setText(str);
		toast.show();
	}

	/**
	 * 设置状态栏颜色 * * @param activity 需要设置的activity * @param color 状态栏颜色值
	 */
	public static void setColor(Activity activity, int color) {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
			// 设置状态栏透明
			activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			// 生成一个状态栏大小的矩形
			View statusView = createStatusView(activity, color);
			// 添加 statusView 到布局中
			ViewGroup decorView = (ViewGroup) activity.getWindow().getDecorView();
			decorView.addView(statusView);
			// 设置根布局的参数
			ViewGroup rootView = (ViewGroup) ((ViewGroup) activity.findViewById(android.R.id.content)).getChildAt(0);
			rootView.setFitsSystemWindows(true);
			rootView.setClipToPadding(true);
		}
	}

	/**
	 * 生成一个和状态栏大小相同的矩形条 * * @param activity 需要设置的activity * @param color 状态栏颜色值 * @return 状态栏矩形条
	 */
	public static View createStatusView(Activity activity, int color) {
		// 获得状态栏高度
		int resourceId = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
		int statusBarHeight = activity.getResources().getDimensionPixelSize(resourceId);
		// 绘制一个和状态栏一样高的矩形
		View statusView = new View(activity);
		LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
				statusBarHeight);
		statusView.setLayoutParams(params);
		statusView.setBackgroundResource(color);
		return statusView;
	}

//	/**
//	 * 显示dialog
//	 */
//	public static void showProgress(MyDialog myDialog){
//		myDialog.getWindow().setLayout(300,300);
//		myDialog.show();
//	}
//
//	public static void hideProgress(MyDialog myDialog){
//		myDialog.dismiss();
//	}
}
