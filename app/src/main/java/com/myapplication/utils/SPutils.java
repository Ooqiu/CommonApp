package com.myapplication.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

import com.myapplication.base.BaseApplication;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * SharedPreferences工具类
 */
public class SPutils {
	private static SharedPreferences sp;
	
	/**保存在手机里面的文件名
	 */
	public static String cacheFileName ="toursim_cache_"+ BaseApplication.AgencID;

	/**
	 * 保存数据的方法
	 */
	public static void put(String key, String value) {
		// a1.获取sp
		if (sp == null) {
			sp = UIUtils.getContext().getSharedPreferences(cacheFileName,
					Context.MODE_PRIVATE);
		}
		Editor editor = sp.edit().putString(key, value);
		SharedPreferencesCompat.apply(editor);
	}
	/**
	 * 获取保存的数据
	 */
	public static String get(String key) {
		if (sp == null) {
			sp = UIUtils.getContext().getSharedPreferences(cacheFileName,
					Context.MODE_PRIVATE);
		}
		return sp.getString(key,"");
	}
	/**
	 * 获取保存的数据
	 */
	public static String getNull(String key) {
		if (sp == null) {
			sp = UIUtils.getContext().getSharedPreferences(cacheFileName,
					Context.MODE_PRIVATE);
		}
		return sp.getString(key,"");
	}

	/**
	 * 移除某个key值已经对应的值
	 * 
	 * @param
	 * @param key
	 */
	public static void remove(String key) {
		if (sp == null) {
			sp = UIUtils.getContext().getSharedPreferences(cacheFileName,
					Context.MODE_PRIVATE);
		}
		Editor editor = sp.edit();
		editor.remove(key);
		SharedPreferencesCompat.apply(editor);
	}

	/**
	 * 清除所有数据
	 * 
	 * @param
	 */
	public static void clear() {
		if (sp == null) {
			sp = UIUtils.getContext().getSharedPreferences(cacheFileName,
					Context.MODE_PRIVATE);
		}
		Editor editor = sp.edit();
		editor.clear();
		SharedPreferencesCompat.apply(editor);
	}

	/**
	 * 查询某个key是否已经存在
	 * 
	 *
	 * @param key
	 * @return
	 */
	public static boolean contains(String key) {
		if (sp == null) {
			sp = UIUtils.getContext().getSharedPreferences(cacheFileName,
					Context.MODE_PRIVATE);
		}
		return sp.contains(key);
	}

	/**
	 * 返回所有的键值对
	 * 
	 *
	 * @return
	 */
	public static Map<String, ?> getAll() {
		if (sp == null) {
			sp = UIUtils.getContext().getSharedPreferences(cacheFileName,
					Context.MODE_PRIVATE);
		}
		return sp.getAll();
	}

	/**
	 * 创建一个解决SharedPreferencesCompat.apply方法的一个兼容类
	 * 
	 * @author zhy
	 * 
	 */
	private static class SharedPreferencesCompat {
		private static final Method sApplyMethod = findApplyMethod();

		/**
		 * 反射查找apply的方法
		 * 
		 * @return
		 */
		@SuppressWarnings({ "unchecked", "rawtypes" })
		private static Method findApplyMethod() {
			try {
				Class clz = Editor.class;
				return clz.getMethod("apply");
			} catch (NoSuchMethodException e) {
			}

			return null;
		}

		/**
		 * 如果找到则使用apply执行，否则使用commit
		 * 
		 * @param editor
		 */
		public static void apply(Editor editor) {
			try {
				if (sApplyMethod != null) {
					sApplyMethod.invoke(editor);
					return;
				}
			} catch (IllegalArgumentException e) {
			} catch (IllegalAccessException e) {
			} catch (InvocationTargetException e) {
			}
			editor.commit();
		}
	}
	/**
	 * 判断是否是第一次启动app
	 */
	public static boolean getBoolean(String key){
		if (sp == null) {
			sp = UIUtils.getContext().getSharedPreferences(cacheFileName,
					Context.MODE_PRIVATE);
		}
		return sp.getBoolean(key,false);
	}
	/**
	 * 记录第一次启动app的boolean值
	 */
	public static void putBoolean(String key, boolean value){
		if (sp == null) {
			sp = UIUtils.getContext().getSharedPreferences(cacheFileName,
					Context.MODE_PRIVATE);
		}
		Editor editor = sp.edit().putBoolean(key, value);
		SharedPreferencesCompat.apply(editor);

	}
	/**
	 * 记录第一次启动app的boolean值
	 */
	public static void putInt(String key, int value){
		if (sp == null) {
			sp = UIUtils.getContext().getSharedPreferences(cacheFileName,
					Context.MODE_PRIVATE);
		}
		Editor editor = sp.edit().putInt(key, value);
		SharedPreferencesCompat.apply(editor);

	}
	public static int getInt(String key){
		if (sp == null) {
			sp = UIUtils.getContext().getSharedPreferences(cacheFileName,
					Context.MODE_PRIVATE);
		}
		return sp.getInt(key,0);
	}
}
