package com.myapplication.retrofit.callback;

/**
 * Created by Administrator on 2016/9/18.
 */
public class ErrorBean {
    private int errorCode;
    private String error;
    private String request;

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    @Override
    public String toString() {
        return "ErrorBean{" +
                "errorCode=" + errorCode +
                ", error='" + error + '\'' +
                ", request='" + request + '\'' +
                '}';
    }
}
