package com.myapplication.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.myapplication.factory.FragmentFactory;


public class MainPagerAdapter extends FragmentPagerAdapter {
	private static final int NUM_ITEMS = 5;

	public MainPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int position) {
		return FragmentFactory.create(position);
	}

	@Override
	public int getCount() {
		return NUM_ITEMS;
	}

}
