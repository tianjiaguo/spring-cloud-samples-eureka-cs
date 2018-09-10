package com.tianjiaguo.site.eureka.model;

/**
 * TODO:
 *
 * @author tianjiaguo
 * @version 2018/9/8 下午4:33
 */
public class Result<T> {
    private long timestamp = System.currentTimeMillis();

    private int status = 500;
    private String error;
    private String message;
    //    private String path;
    private T result;

    public Result(){

    }

    public Result(int status, String error, String message, T result) {
        this.status = status;
        this.error = error;
        this.message = message;
        this.result = result;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
