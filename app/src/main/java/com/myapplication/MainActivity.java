package com.myapplication;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.myapplication.adapter.MainPagerAdapter;
import com.myapplication.base.BaseActivity;
import com.myapplication.base.BaseFragment;
import com.myapplication.utils.UIUtils;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {
    public static Context context;
    public FrameLayout fl_main;
    public RadioGroup rg_main_radio;
    public int index = 0;
    private MainPagerAdapter mMainPagerdapter;
    private BaseFragment fragment;
    @BindView(R.id.rb_main_HomePage)
    public RadioButton rb_main_HomePage;
    //记录按下home键的时间
    private long exitTime = 0;
    @Override
    protected void initView() {
        context = this;
        ButterKnife.bind(this);
        fl_main = findViewById(R.id.fl_main);
        rg_main_radio = findViewById(R.id.rg_main_radio);
        mMainPagerdapter = new MainPagerAdapter(getSupportFragmentManager());

    }
    public void switchFragment(int index) {
        fragment = (BaseFragment) mMainPagerdapter
                .instantiateItem(fl_main, index);
        mMainPagerdapter.setPrimaryItem(null, 0, fragment);
        mMainPagerdapter.finishUpdate(null);
    }
    private void radioCheckedChange() {
        rg_main_radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.rb_main_HomePage:
                        index = 0;
                        break;
                    case R.id.rb_main_type:
                        index = 1;
                        break;
                    case R.id.rb_main_shoppingcar:
                        index = 2;
//                        tv_middle.setVisibility(View.VISIBLE);
                        break;
                    case R.id.rb_main_mine:
                        index = 3;
//                        iv_search.setImageResource(R.mipmap.setting);
                        break;
                }
                switchFragment(index);
            }
        });
    }

    @Override
    protected void initData() {
        switchFragment(index);
        rb_main_HomePage.setChecked(true);
        radioCheckedChange();
    }
    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    public static MainActivity getInstance(){
        return (MainActivity) context;
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if ((System.currentTimeMillis() - exitTime) > 2000) {
                UIUtils.showToast(this,"再按一次退出国寿i购");
                exitTime = System.currentTimeMillis();
            } else {
                this.finish();
                System.exit(0);
            }
            return false;
        }
        return super.onKeyDown(keyCode, event);
    }
}
