package com.myapplication.view;

import android.app.ActionBar;
import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.myapplication.R;


/**
 * Created by 彭 on 2017/8/11.
 */
public class UpDateDialog {
    private Context context;
    private View mLayout;
    private TextView sureButton;
    private TextView cancleButton;
    private boolean mCancelable = false;
    private View.OnClickListener sureClickListener,
            cancelClickListener;
    Dialog dialog;
    private int i;
    public UpDateDialog(Context context, int i) {
        this.context = context;
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mLayout = inflater.inflate(R.layout.base_dialog_layout, null);
        if(i == 0) {
            mLayout.findViewById(R.id.cancel).setVisibility(View.GONE);
        }else{
            mLayout.findViewById(R.id.cancel).setVisibility(View.VISIBLE);
        }

    }
    //能否返回键取消
    public UpDateDialog setCancelable(Boolean boolean1) {
        this.mCancelable = boolean1;
        return this;
    }

    public UpDateDialog title(int title) {
        ((TextView) mLayout.findViewById(R.id.title)).setText(title);
        return this;
    }

    public UpDateDialog title(String title) {
        ((TextView) mLayout.findViewById(R.id.title)).setText(title);
        return this;
    }

    public UpDateDialog titleColor(int color) {
        ((TextView) mLayout.findViewById(R.id.title)).setTextColor(context.getResources().getColor(color));

        return this;
    }

    public UpDateDialog titleBackColor(int color) {
        mLayout.findViewById(R.id.title_back).setBackgroundColor(context.getResources().getColor(color));
        return this;
    }

    public UpDateDialog setSureOnClickListener(View.OnClickListener listener) {
        this.sureClickListener = listener;
        return this;
    }

    public UpDateDialog message(String message) {
        ((TextView) mLayout.findViewById(R.id.message)).setText(message);
        return this;
    }

    public UpDateDialog message(int message) {
        ((TextView) mLayout.findViewById(R.id.message)).setText(message);
        return this;
    }
    public UpDateDialog sureTextColor(int color) {
        ((TextView) mLayout.findViewById(R.id.sure)).setTextColor(context.getResources().getColor(color));
        return this;
    }

    public UpDateDialog cancelTextColor(int color) {
        ((TextView) mLayout.findViewById(R.id.cancel)).setTextColor(context.getResources().getColor(color));
        return this;
    }

    //切换内容view
    public UpDateDialog setView(View v) {
        ((LinearLayout) mLayout.findViewById(R.id.content)).removeAllViews();
        ((LinearLayout) mLayout.findViewById(R.id.content)).addView(v);
        return this;
    }
    //确定按钮文本
    public UpDateDialog SureText(String str) {
        ((TextView) mLayout.findViewById(R.id.sure)).setText(str);
        return this;
    }

    public UpDateDialog setView(View v, LinearLayout.LayoutParams params) {
        ((LinearLayout) mLayout.findViewById(R.id.content)).removeAllViews();
        ((LinearLayout) mLayout.findViewById(R.id.content)).addView(v, params);
        return this;
    }

    public UpDateDialog showCancelButton(boolean isShow) {
        if (!isShow)
            mLayout.findViewById(R.id.cancel).setVisibility(View.GONE);
        return this;
    }

    public UpDateDialog noTitle() {
        mLayout.findViewById(R.id.title_back).setVisibility(View.GONE);
        return this;
    }

    public UpDateDialog justMessageDialog() {
        sureClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        };
        return this;
    }

    public Dialog builder() {
        dialog = new Dialog(context, R.style.base_dialog);
        dialog.setCancelable(mCancelable);
        dialog.addContentView(mLayout, new ActionBar.LayoutParams(
                ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.MATCH_PARENT));
        if (sureClickListener != null) {
            mLayout.findViewById(R.id.sure).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    sureClickListener.onClick(v);
                    if(i == 1) {
                        dialog.dismiss();
                    }
                }
            });
        }
        mLayout.findViewById(R.id.cancel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cancelClickListener != null) {
                    cancelClickListener.onClick(v);
                }
                dialog.dismiss();
            }
        });

        return dialog;
    }
}