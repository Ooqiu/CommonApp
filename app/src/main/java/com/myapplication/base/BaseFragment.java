package com.myapplication.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.myapplication.utils.ViewUtils;

import java.lang.reflect.Field;

import butterknife.ButterKnife;

/**
 *  author：PengHongQiu
 * data: 2017/12/6 15:17
 *  e-mail：18330470538@163.com
 *  
 */
public abstract class BaseFragment extends Fragment {
    public Context context;
    protected View mView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getActivity();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
    }



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        if (mView == null) {
            mView = loadView();
        } else {
            ViewUtils.removeSelfFromParent(mView);
        }
        ButterKnife.bind(this,mView);
        initView();

        return mView;

    }
    public View loadView() {
        return View.inflate(context, getLayoutId(), null);

    }

    /** 返回界面布局 */
    protected abstract int getLayoutId();

    /** 初始化布局 */
    protected abstract void initView();

    /**
     * 加载数据
     */
    protected  void initData(){

    }

    /**
     * 切换fragment的时候实现数据保存
     * @param menuVisible
     */
    @Override
    public void setMenuVisibility(boolean menuVisible) {
        if (getView() != null) {
            getView().setVisibility(menuVisible ? View.VISIBLE : View.GONE);
        }
        super.setMenuVisibility(menuVisible);
    }
    @Override
    public void onDetach() {
        super.onDetach();
        try {
            Field childFragmentManager = Fragment.class
                    .getDeclaredField("mChildFragmentManager");
            childFragmentManager.setAccessible(true);
            childFragmentManager.set(this, null);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
