package com.myapplication.fragment;

import android.widget.TextView;

import com.baidu.location.BDAbstractLocationListener;
import com.baidu.location.BDLocation;
import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;
import com.myapplication.R;
import com.myapplication.base.BaseFragment;
import com.myapplication.bean.HomePageBean;
import com.myapplication.retrofit.RetrofitClient;
import com.myapplication.retrofit.service.ArticleService;
import com.myapplication.utils.LogUtils;

import butterknife.BindView;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 *  author：PengHongQiu
 * data: 2017/12/6 15:26
 *  e-mail：18330470538@163.com
 *  
 */
public class HomePageFragment extends BaseFragment {
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
        tv_home.setText("首页");
        onstar();
        ArticleService service = RetrofitClient.createService(ArticleService.class);
        service.getList()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<HomePageBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        LogUtils.e(e.getMessage());
                    }

                    @Override
                    public void onNext(HomePageBean homePageBean) {
                        LogUtils.e(homePageBean.toString());
                        LogUtils.e("---------1");
                    }
                });
    }

    public LocationClient mLocationClient = null;
    private MyLocationListener myListener = new MyLocationListener();

    //BDAbstractLocationListener为7.2版本新增的Abstract类型的监听接口
//原有BDLocationListener接口暂时同步保留。具体介绍请参考后文中的说明
    public void onstar() {
        mLocationClient = new LocationClient(getContext());
        //声明LocationClient类
        mLocationClient.registerLocationListener(myListener);
        //注册监听函数
        LocationClientOption option = new LocationClientOption();

        option.setIsNeedAddress(true);
//可选，是否需要地址信息，默认为不需要，即参数为false
//如果开发者需要获得当前点的地址信息，此处必须为true

        mLocationClient.setLocOption(option);
        mLocationClient.start();
//mLocationClient为第二步初始化过的LocationClient对象
//需将配置好的LocationClientOption对象，通过setLocOption方法传递给LocationClient对象使用
//更多LocationClientOption的配置，请参照类参考中LocationClientOption类的详细说明
    }
    public class MyLocationListener extends BDAbstractLocationListener {
        @Override
        public void onReceiveLocation(BDLocation location){
            //此处的BDLocation为定位结果信息类，通过它的各种get方法可获取定位相关的全部结果
            //以下只列举部分获取地址相关的结果信息
            //更多结果信息获取说明，请参照类参考中BDLocation类中的说明
            LogUtils.e("---------");
            String addr = location.getAddrStr();    //获取详细地址信息
            String country = location.getCountry();    //获取国家
            String province = location.getProvince();    //获取省份
            String city = location.getCity();    //获取城市
            String district = location.getDistrict();    //获取区县
            String street = location.getStreet();    //获取街道信息
            LogUtils.e(country+province+city+district+street+addr);
        }
    }
}
