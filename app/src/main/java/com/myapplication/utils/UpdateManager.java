package com.myapplication.utils;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;

import com.myapplication.R;
import com.myapplication.bean.HomePageBean;
import com.myapplication.interf.Url;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author coolszy
 * @date 2012-4-26
 * @blog http://blog.92coding.com
 */

public class UpdateManager {

    //更新信息
    HomePageBean.DataBean data;
    /* 下载中 */
    private static final int DOWNLOAD = 1;
    /* 下载结束 */
    private static final int DOWNLOAD_FINISH = 2;
    /* 记录进度条数量 */
    private int progress;
    /* 是否取消更新 */
    private boolean cancelUpdate = false;

    private Context mContext;
    /* 更新进度条 */
    private ProgressBar mProgress;
    private Dialog mDownloadDialog;
    private int i;
    private Handler mHandler = new Handler() {
        public void handleMessage(Message msg) {
            switch (msg.what) {
                // 正在下载
                case DOWNLOAD:
                    // 设置进度条位置
                    mProgress.setProgress(progress);
                    break;
                case DOWNLOAD_FINISH:
                    // 安装文件
                    installApk();
                    break;
                default:
                    break;
            }
        }
    };

//    public UpdateManager(Context context, HomePageBean.DataBean data, int i) {
//        this.mContext = context;
//        this.data = data;
//        this.i = i;
//    }


    /**
     * 检测软件更新
     */
    public void checkUpdate() {
//        if (isUpdate()) {
//            // 显示提示对话框
//            if (updateInformation.isForce()) {//强制更新
//                showForceNoticeDialog();
//            } else {//选择性通知
//                showNoticeDialog();
//            }
//        } else {
////            Toast.makeText(mContext, R.string.soft_update_no, Toast.LENGTH_LONG).show();
//        }

    }

    private boolean isUpdate;

    public interface ForceUpdate {
        void isUpdate();
    }

    private ForceUpdate forceUpdate;

    public void setForceUpdate(ForceUpdate forceUpdate) {
        this.forceUpdate = forceUpdate;
    }

//    /**
//     * 强制更新
//     */
//    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
//    private void showForceNoticeDialog() {
//        // 构造对话框
//        UpDateDialog builder = new UpDateDialog(mContext);
//        builder.setTitle("");
//        builder.setMessage("");
//        // 更新
//        builder.setPositiveButton("立即更新", new OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                dialog.dismiss();
//                isUpdate = true;
//                // 显示下载对话框
////                showDownloadDialog();
//            }
//        });
//        builder.setOnDismissListener(new DialogInterface.OnDismissListener() {
//            @Override
//            public void onDismiss(DialogInterface dialogInterface) {
//                if (!isUpdate && forceUpdate != null) {
//                    forceUpdate.isUpdate();
//                }
//            }
//        });
//        Dialog noticeDialog = builder.create();
//        noticeDialog.show();
//    }

    /**
     * 检查软件是否有更新版本
     *
     * @return
     */
//    public boolean isUpdate() {
//        // 获取当前软件版本
//        int versionCode = getVersionCode(mContext);
//
//        // 版本判断
//       return false;
//    }

    /**
     * 获取软件版本号
     *
     * @param context
     * @return
     */
    public static int getVersionCode(Context context) {

        int versionCode = 0;
        try {
            // 获取软件版本号，对应AndroidManifest.xml下android:versionCode
            versionCode = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (NameNotFoundException e) {
            e.printStackTrace();
        }
        return versionCode;
    }

    /**
     * 获取软件版本名
     *
     * @param context
     * @return
     */
    public static String getVersionName(Context context) {

        String versionName = "";
        try {
            // 获取软件版本号，对应AndroidManifest.xml下android:versionCode
            versionName = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (NameNotFoundException e) {
            e.printStackTrace();
        }
        return versionName;
    }

    /**
     * 选择性通知更新框
     */
    public void showNoticeDialog() {
//        // 构造对话框
//        UpDateDialog builder = new UpDateDialog(mContext);
//        builder.setTitle("发现新版本  " + data.getAppVersionName());
//        builder.setMessage(data.getAppVersionContent());
//
////        builder.setMessage("1.部分UI优化\n2.修改部分bug");
////         更新
//        builder.setPositiveButton("立即更新", new OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                dialog.dismiss();
//                // 显示下载
//                showDownloadDialog();
//            }
//        });
//        // 稍后更新
//        builder.setNegativeButton("暂不更新", new OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                dialog.dismiss();
//            }
//        });
//        Dialog noticeDialog = builder.create();
//        noticeDialog.show();
//        new UpDateDialog(mContext,i).title("发现新版本  " + data.getAppVersionName())
//                .message(data.getAppVersionContent()).setSureOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                showDownloadDialog();
//            }
//        }).builder().show();
    }

    /**
     * 显示软件下载对话框
     */
    private void showDownloadDialog() {
        // 构造软件下载对话框
        Builder builder = new Builder(mContext);
        builder.setCancelable(false);
        builder.setMessage("");
        // 给下载对话框增加进度条
        final LayoutInflater inflater = LayoutInflater.from(mContext);
        View v = inflater.inflate(R.layout.softupdate_progress, null);
        mProgress = (ProgressBar) v.findViewById(R.id.update_progress);
        builder.setView(v);
//        // 取消更新
//        builder.setNegativeButton("取消更新", new OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                dialog.dismiss();
//                cancelUpdate = true;
//            }
//        });
        mDownloadDialog = builder.create();
        mDownloadDialog.show();
        // 现在文件
        downloadApk();
    }

    /**
     * 下载apk文件
     */
    private void downloadApk() {
        // 启动新线程下载软件
        new downloadApkThread().start();
    }

    /**
     * 下载文件线程
     *
     * @author coolszy
     * @date 2012-4-26
     * @blog http://blog.92coding.com
     */
    private class downloadApkThread extends Thread {
        @Override
        public void run() {
            try {
                // 判断SD卡是否存在，并且是否具有读写权限
                if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
                    URL url = new URL(Url.URL+"/resources/emate-qq.apk");
                    // 创建连接
                    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                    conn.connect();
                    // 获取文件大小
                    int length = conn.getContentLength();
                    // 创建输入流
                    InputStream is = conn.getInputStream();
                    File apkFile = FileUtils.getFile(mContext, 4, "emate.apk");
                    LogUtils.e(apkFile+"--");
                    FileOutputStream fos = new FileOutputStream(apkFile);
                    int count = 0;
                    // 缓存
                    byte buf[] = new byte[1024];
                    // 写入到文件中
                    do {
                        int numread = is.read(buf);
                        count += numread;
                        // 计算进度条位置
                        progress = (int) (((float) count / length) * 100);
                        // 更新进度
                        mHandler.sendEmptyMessage(DOWNLOAD);
                        if (numread <= 0) {
                            // 下载完成
                            mHandler.sendEmptyMessage(DOWNLOAD_FINISH);
                            break;
                        }
                        // 写入文件
                        fos.write(buf, 0, numread);
                    } while (!cancelUpdate);// 点击取消就停止下载.
                    fos.close();
                    is.close();
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            // 取消下载对话框显示
            mDownloadDialog.dismiss();
        }
    }

    ;

    /**
     * 安装APK文件
     */
    private void installApk() {
        File apkFile = FileUtils.getFile(mContext, 4, "emate.apk");
        if (!apkFile.exists()) {
            return;
        }
        // 通过Intent安装APK文件
        Intent i = new Intent(Intent.ACTION_VIEW);
//        i.setDataAndType(Uri.parse("file://" + apkFile.toString()), "application/vnd.android.package-archive");
        i.setDataAndType(Uri.fromFile(apkFile), "application/vnd.android.package-archive");
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        mContext.startActivity(i);
    }

//    /**
//     * 设置新版本信息
//     */
//    public static void setupDateInfo(Context context) {
//        /**
//         * serverVersionNo
//         * serverVersionName
//         * isForce
//         * updateUrl
//         * upgradeInfo
//         */
//        HashMap map = new HashMap();
//        map.put("serverVersionNo", getVersionCode(context));
//        map.put("serverVersionName", getVersionName(context));
//        map.put("isForce", false);
//        map.put("updateUrl", "http://www.xuehuiwang.com/download/xuehuiwang.apk");
//        map.put("upgradeInfo", "检测到新版本，立即更新吗？");
//        HttpHelper.get(Url.setUpdateInfo, map, new RequestListener() {
//            @Override
//            public void onResponse(String response) {
//                TLog.log("setUpdateInfoResponse=" + response);
//            }
//
//            @Override
//            public void onFail(String msg) {
//            }
//
//            @Override
//            public void onError(Request request, Exception e) {
//                TLog.log("setUpdateInfoInfo.getmessage=" + e.getMessage());
//            }
//        });
//    }
}
