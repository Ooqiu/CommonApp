package com.myapplication.fragment;

import android.widget.TextView;

import com.myapplication.R;
import com.myapplication.base.BaseFragment;

import butterknife.BindView;

/**
 *  author：PengHongQiu
 * data: 2017/12/6 15:26
 *  e-mail：18330470538@163.com
 *  
 */
public class TypeFragment extends BaseFragment {
    @BindView(R.id.tv_home)
    public TextView tv_home;
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initView() {
//        ButterKnife.bind(this,mView);
    }

    @Override
    protected void initData() {
        super.initData();
        tv_home.setText("分类");
    }
}
