package com.myapplication.view;

import android.annotation.TargetApi;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import com.myapplication.base.BaseActivity;


/**
 *  author：PengHongQiu
 * data: 2017/6/8 14:09
 *  e-mail：18330470538@163.com
 *  
 */
public class MyChromeClient extends WebChromeClient {
    public ValueCallback<Uri> UploadMsg;
    public ValueCallback<Uri[]> UploadMsg2;
    private BaseActivity activity;
    public static final int FILECHOOSER_RESULTCODE = 5173;
    public static String mCameraFilePath = "";
    @SuppressWarnings("deprecation")
    public MyChromeClient(BaseActivity cordova) {

        this.activity = cordova;

    }

    @Override
    public void onProgressChanged(WebView view, int newProgress) {

        super.onProgressChanged(view, newProgress);

    }

//
//
//    // <input type="file" name="fileField" id="fileField" />
//
//    // Android > 4.1.1
//    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
//    @Override
//    public boolean onShowFileChooser(WebView webView,
//                                     ValueCallback<Uri[]> filePathCallback,
//                                     FileChooserParams fileChooserParams) {
//        // TODO 自动生成的方法存根
//        UploadMsg2 = filePathCallback;
//        this.activity.startActivityForResult(createDefaultOpenableIntent(),
//
//                this.FILECHOOSER_RESULTCODE);
//        return false;
//    }
//
//    @SuppressWarnings("static-access")
//    public void openFileChooser(ValueCallback<Uri> uploadMsg,
//
//                                String acceptType, String capture) {
//
//        UploadMsg = uploadMsg;
//
//        this.activity.startActivityForResult(createDefaultOpenableIntent(),
//
//                this.FILECHOOSER_RESULTCODE);
//
//    }
//
//    // 3.0 +
//
//    @SuppressWarnings("static-access")
//    public void openFileChooser(ValueCallback<Uri> uploadMsg, String acceptType) {
//
//        UploadMsg = uploadMsg;
//
//        this.activity.startActivityForResult(createDefaultOpenableIntent(),
//
//                this.FILECHOOSER_RESULTCODE);
//
//    }
//
//    // Android < 3.0
//
//    @SuppressWarnings("static-access")
//    public void openFileChooser(ValueCallback<Uri> uploadMsg) {
//
//        UploadMsg = uploadMsg;
//
//        this.activity.startActivityForResult(createDefaultOpenableIntent(),
//
//                this.FILECHOOSER_RESULTCODE);
//
//    }
//
//    private Intent createDefaultOpenableIntent() {
//
//        Intent i = new Intent(Intent.ACTION_GET_CONTENT);
//
//        i.addCategory(Intent.CATEGORY_OPENABLE);
//
//        i.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
//
//                "image/*");
//
//        Intent chooser = createChooserIntent(createCameraIntent()/*
//                                                                 *
//                                                                 * ,
//                                                                 *
//                                                                 * createCamcorderIntent
//                                                                 *
//                                                                 * (),
//                                                                 *
//                                                                 * createSoundRecorderIntent
//                                                                 *
//                                                                 * ()
//                                                                 */);
//
//        chooser.putExtra(Intent.EXTRA_INTENT, i);
//
//        return chooser;
//
//    }
//
//    private Intent createChooserIntent(Intent... intents) {
//
//        Intent chooser = new Intent(Intent.ACTION_CHOOSER);
//
//        chooser.putExtra(Intent.EXTRA_INITIAL_INTENTS, intents);
//
//        chooser.putExtra(Intent.EXTRA_TITLE, "选择图片");
//        return chooser;
//
//    }
//
//    @SuppressWarnings("static-access")
//    private Intent createCameraIntent() {
//
//        Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//
//        File externalDataDir = Environment
//
//                .getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
//
//        File cameraDataDir = new File(externalDataDir.getAbsolutePath()
//
//                + File.separator + "515aaa");
//
//        cameraDataDir.mkdirs();
//
//        String mCameraFilePath = cameraDataDir.getAbsolutePath()
//
//                + File.separator + System.currentTimeMillis() + ".jpg";
//
//        this.mCameraFilePath = mCameraFilePath;
//
//        cameraIntent.putExtra(MediaStore.Images.Media.ORIENTATION, 0);
//
//        cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT,
//
//                Uri.fromFile(new File(mCameraFilePath)));
//
//        return cameraIntent;
//
//    }
//
//    /*
//     *
//     * private Intent createCamcorderIntent() { return new
//     *
//     * Intent(MediaStore.ACTION_VIDEO_CAPTURE); }
//     *
//     *
//     *
//     * private Intent createSoundRecorderIntent() { return new
//     *
//     * Intent(MediaStore.Audio.Media.RECORD_SOUND_ACTION); }
//     */
//
//    public static Uri getImageContentUri(Context context, java.io.File imageFile) {
//
//        String filePath = imageFile.getAbsolutePath();
//
//        Cursor cursor = context.getContentResolver().query(
//
//                MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
//
//                new String[] { MediaStore.Images.Media._ID },
//
//                MediaStore.Images.Media.DATA + "=? ",
//
//                new String[] { filePath }, null);
//
//        if (cursor != null && cursor.moveToFirst()) {
//
//            int id = cursor.getInt(cursor
//
//                    .getColumnIndex(MediaStore.MediaColumns._ID));
//
//            Uri baseUri = Uri.parse("content://media/external/images/media");
//
//            return Uri.withAppendedPath(baseUri, "" + id);
//
//        } else {
//
//            if (imageFile.exists()) {
//
//                ContentValues values = new ContentValues();
//
//                values.put(MediaStore.Images.Media.DATA, filePath);
//
//                return context.getContentResolver().insert(
//
//                        MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values);
//
//            } else {
//
//                return null;
//
//            }
//
//        }
//
//    }
//The undocumented magic method override
//Eclipse will swear at you if you try to put @Override here
// For Android 3.0+
public void openFileChooser(ValueCallback<Uri> uploadMsg) {

    activity.mUploadMessage = uploadMsg;
    Intent i = new Intent(Intent.ACTION_GET_CONTENT);
    i.addCategory(Intent.CATEGORY_OPENABLE);
    i.setType("image/*");
    activity.startActivityForResult(Intent.createChooser(i, "File Chooser"), activity.FILECHOOSER_RESULTCODE);

}

    // For Android 3.0+
    public void openFileChooser(ValueCallback uploadMsg, String acceptType) {
        activity.mUploadMessage = uploadMsg;
        Intent i = new Intent(Intent.ACTION_GET_CONTENT);
        i.addCategory(Intent.CATEGORY_OPENABLE);
        i.setType("*/*");
        activity.startActivityForResult(Intent.createChooser(i, "File Browser"), activity.FILECHOOSER_RESULTCODE);
    }

    //For Android 4.1
    public void openFileChooser(ValueCallback<Uri> uploadMsg, String acceptType, String capture) {
        activity.mUploadMessage = uploadMsg;
        Intent i = new Intent(Intent.ACTION_GET_CONTENT);
        i.addCategory(Intent.CATEGORY_OPENABLE);
        i.setType("image/*");
        activity.startActivityForResult(Intent.createChooser(i, "File Chooser"), activity.FILECHOOSER_RESULTCODE);

    }

    //For Android 5.0
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> filePathCallback, FileChooserParams fileChooserParams) {
        // make sure there is no existing message
        if (activity.uploadMessage != null) {
            activity.uploadMessage.onReceiveValue(null);
            activity.uploadMessage = null;
        }
        activity.uploadMessage = filePathCallback;
        Intent intent = fileChooserParams.createIntent();
        try {
            activity.startActivityForResult(intent, activity.REQUEST_SELECT_FILE);
        } catch (ActivityNotFoundException e) {
            activity.uploadMessage = null;
            return false;
        }
        return true;
    }
}
