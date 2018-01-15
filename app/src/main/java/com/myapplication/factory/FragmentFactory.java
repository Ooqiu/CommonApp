package com.myapplication.factory;

import android.support.v4.app.Fragment;

import com.myapplication.fragment.HomePageFragment;
import com.myapplication.fragment.MineFragment;
import com.myapplication.fragment.ShopCartFragment;
import com.myapplication.fragment.TypeFragment;
import com.myapplication.utils.UIUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Created by WZ on 2016/1/27
 * 碎片管理类
 */
public class FragmentFactory {
	public static final int TAB_HOMEPAGE = 0;
	public static final int TAB_GOODS = 1;
	public static final int TAB_LUCKY = 2;
	public static final int TAB_MINE = 3;
	private static Map<Integer, Fragment> mFragmentMap = new HashMap<Integer, Fragment>();

	public static Fragment create(int position) {
		Fragment fragment = mFragmentMap.get(position);
		 //Fragment fragment = null;
		// 已经创建的Fragment不再创建
		if (fragment == null) {
			switch (position) {
			case TAB_HOMEPAGE:
				fragment = new HomePageFragment();
				break;
			case TAB_GOODS:
				fragment = new TypeFragment();
				break;
			case TAB_LUCKY:
				fragment = new ShopCartFragment();
				break;
			case TAB_MINE:
				fragment = new MineFragment();
				break;
			}
			mFragmentMap.put(position, fragment);
		}

		return fragment;
	}

	private static Map<Class<?>, Fragment> mFragmentPage = new HashMap<Class<?>, Fragment>();

	public static Fragment create(Class<?> clazz) {
		Fragment fragment = mFragmentPage.get(clazz);
		 //Fragment fragment = null;
		if (fragment == null) {
			fragment = Fragment.instantiate(UIUtils.getContext(),
					clazz.getName());
			mFragmentPage.put(clazz, fragment);
		}
		return fragment;
	}

public static Map<Integer, Fragment> getAllFragment(){
	return mFragmentMap;
}
}
