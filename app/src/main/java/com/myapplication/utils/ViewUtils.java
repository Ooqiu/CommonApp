package com.myapplication.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.myapplication.MainActivity;


/**
 * WZ 2016/1/27
 */
public class ViewUtils {
	private static int height;
	private static int width;

	/** 把自身从父View中移除 */
	public static void removeSelfFromParent(View view) {
		if (view != null) {
			ViewParent parent = view.getParent();
			if (parent != null && parent instanceof ViewGroup) {
				ViewGroup group = (ViewGroup) parent;
				group.removeView(view);
			}
		}
	}

	/** 测量View的高度,一定能测到的方法 */
	public static int getViewHeight(final View view) {

		view.getViewTreeObserver().addOnGlobalLayoutListener(
				new OnGlobalLayoutListener() {
					@SuppressWarnings("deprecation")
					@Override
					public void onGlobalLayout() {
						view.getViewTreeObserver()
								.removeGlobalOnLayoutListener(this);
						height = view.getHeight();
					}
				});
		return height;
	}

	/** 测量View的宽度,一定能测到的方法 */
	public static int getViewWidth(final View view) {

		view.getViewTreeObserver().addOnGlobalLayoutListener(
				new OnGlobalLayoutListener() {
					@SuppressWarnings("deprecation")
					@Override
					public void onGlobalLayout() {
						view.getViewTreeObserver()
								.removeGlobalOnLayoutListener(this);
						width = view.getHeight();
					}
				});
		return width;
	}

	/** 请求View树重新布局，用于解决中层View有布局状态而导致上层View状态断裂 */
	public static void requestLayoutParent(View view, boolean isAll) {
		ViewParent parent = view.getParent();
		while (parent != null && parent instanceof View) {
			if (!parent.isLayoutRequested()) {
				parent.requestLayout();
				if (!isAll) {
					break;
				}
			}
			parent = parent.getParent();
		}
	}

	/** 判断触点是否落在该View上 */
	public static boolean isTouchInView(MotionEvent ev, View v) {
		int[] vLoc = new int[2];
		v.getLocationOnScreen(vLoc);
		float motionX = ev.getRawX();
		float motionY = ev.getRawY();
		return motionX >= vLoc[0] && motionX <= (vLoc[0] + v.getWidth())
				&& motionY >= vLoc[1] && motionY <= (vLoc[1] + v.getHeight());
	}
	/** 给view设置监听 */
	public static void setOnClickListeners(OnClickListener l, View... views) {
		for (View view : views) {
			if (null != view) {
				view.setOnClickListener(l);
			}
		}
	}

	/**
	 * 将彩色View转换为黑白的Bitmap
	 * 
	 * @param
	 * @return 返回转换好的位图
	 */
	public static Bitmap toGrayscale(View v) {
		return toGrayscale(getViewBitmap(v));
	}

	/**
	 * 将View转换为Bitmap
	 * 
	 * @param
	 * @return 返回转换好的位图
	 */
	public static Bitmap getViewBitmap(View v) {
		v.clearFocus();
		v.setPressed(false);

		boolean willNotCache = v.willNotCacheDrawing();
		v.setWillNotCacheDrawing(false);

		// Reset the drawing cache background color to fully transparent
		// for the duration of this operation
		int color = v.getDrawingCacheBackgroundColor();
		v.setDrawingCacheBackgroundColor(0);

		if (color != 0) {
			v.destroyDrawingCache();
		}
		v.buildDrawingCache();
		Bitmap cacheBitmap = v.getDrawingCache();
		if (cacheBitmap == null) {
			return null;
		}

		Bitmap bitmap = Bitmap.createBitmap(cacheBitmap);

		// Restore the view
		v.destroyDrawingCache();
		v.setWillNotCacheDrawing(willNotCache);
		v.setDrawingCacheBackgroundColor(color);

		return bitmap;
	}

	/**
	 * 将彩色图转换为纯黑白二色
	 * 
	 * @param bmpOriginal
	 * @return 返回转换好的位图
	 */
	public static Bitmap toGrayscale(Bitmap bmpOriginal) {
		int width, height;
		height = bmpOriginal.getHeight();
		width = bmpOriginal.getWidth();

		Bitmap bmpGrayscale = Bitmap.createBitmap(width, height,
				Bitmap.Config.RGB_565);
		Canvas c = new Canvas(bmpGrayscale);
		Paint paint = new Paint();
		ColorMatrix cm = new ColorMatrix();
		cm.setSaturation(0);
		ColorMatrixColorFilter f = new ColorMatrixColorFilter(cm);
		paint.setColorFilter(f);
		c.drawBitmap(bmpOriginal, 0, 0, paint);
		return bmpGrayscale;
	}

	/** FindViewById的泛型封装，减少强转代码 */
	public static <T extends View> T findViewById(View layout, int id) {
		return (T) layout.findViewById(id);
	}
	/**
	 * 判断图片是否是以http开头的并加载图片
	 */
	public static void loadImage(Context context, String url, ImageView imageView){
		Glide.with(context).load(url).into(imageView);
	}
	/** 
	 * popupwindow改变背景颜色 
	 */
	public static void darkenBackground(Context context, Float bgcolor){
		MainActivity activity = (MainActivity) context;
		WindowManager.LayoutParams lp = activity.getWindow().getAttributes();
		lp.alpha = bgcolor;
		activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
		activity.getWindow().setAttributes(lp);
	}
}
