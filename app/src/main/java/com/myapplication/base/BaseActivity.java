package com.myapplication.base;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.ValueCallback;

import com.myapplication.R;

public abstract class BaseActivity extends FragmentActivity {
    public static final int REQUEST_SELECT_FILE = 100;
    public final static int FILECHOOSER_RESULTCODE = 1;
    public ValueCallback<Uri[]> uploadMessage;
    public ValueCallback<Uri> mUploadMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getRootView());
        initView();
        initData();
    }

    /**
     * 初始化布局
     */
    protected abstract void initView();

    /**
     * 初始化数据
     */
    protected abstract void initData();
    /**
     * 获取根View
     */
    public View getRootView() {

        if (getLayoutId() != 0) {
            return View.inflate(this, getLayoutId(), null);
        } else {
            return View.inflate(this, R.layout.activity_base, null);
        }
    }

    /**
     * 返回界面布局
     */
    protected abstract int getLayoutId();

    /***
     * 关软件盘
     *
     * @param v
     */
    public void HideKeyboard(View v) {
        InputMethodManager imm = (InputMethodManager) v.getContext()
                .getSystemService(Context.INPUT_METHOD_SERVICE);
        if (imm.isActive()) {
            imm.hideSoftInputFromWindow(v.getApplicationWindowToken(), 0);

        }
    }

    /**
     * 显示软件盘
     */
    public void ShowKeyboard(View v) {
        InputMethodManager imm = (InputMethodManager) v.getContext()
                .getSystemService(Context.INPUT_METHOD_SERVICE);

        imm.showSoftInput(v, InputMethodManager.SHOW_FORCED);

    }

}
