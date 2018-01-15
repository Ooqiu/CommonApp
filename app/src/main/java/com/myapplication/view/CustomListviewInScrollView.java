package com.myapplication.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 * @author 自定义listview可嵌套在scrollview中
 *
 */
public class CustomListviewInScrollView extends ListView {
	public CustomListviewInScrollView(Context context) {
		super(context);
	}

	public CustomListviewInScrollView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public CustomListviewInScrollView(Context context, AttributeSet attrs,
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