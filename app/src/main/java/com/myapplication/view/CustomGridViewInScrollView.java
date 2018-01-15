package com.myapplication.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

/**
 * @author 自定义gridview可嵌套在scrollview中
 *
 */
public class CustomGridViewInScrollView extends GridView {
	public CustomGridViewInScrollView(Context context) {
		super(context);
	}

	public CustomGridViewInScrollView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public CustomGridViewInScrollView(Context context, AttributeSet attrs,
                                      int defStyle) {
		super(context, attrs, defStyle);
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
				MeasureSpec.AT_MOST);

		super.onMeasure(widthMeasureSpec, expandSpec);
	}
	
}