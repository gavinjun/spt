package com.gavin.spt.common.api;

public class CommonResult<T> {
    /**
     * 状态码
     */
    private int ret;
    /**
     * 提示信息
     */
    private String message;
    /**
     * 数据封装
     */
    private T data;

    protected CommonResult() {
    }

    protected CommonResult(int ret, String message, T data) {
        this.ret = ret;
        this.message = message;
        this.data = data;
    }

    /**
     * 成功返回结果
     *
     * @param data 获取的数据
     */
    public static <T> CommonResult<T> success(T data) {
        return new CommonResult<T>(0, "", data);
    }

    /**
     * 成功返回结果
     *
     * @param data 获取的数据
     * @param  message 提示信息
     */
    public static <T> CommonResult<T> success(T data, String message) {
        return new CommonResult<T>(0, message, data);
    }

    /**
     * 失败返回结果
     * @param error 错误码
     */
    public static <T> CommonResult<T> failed(IError error) {
        return new CommonResult<T>(error.getRet(), error.getMessage(), null);
    }

    /**
     * 失败返回结果
     * @param error 错误码
     * @param message 错误信息
     */
    public static <T> CommonResult<T> failed(IError error,String message) {
        return new CommonResult<T>(error.getRet(), message, null);
    }

    /**
     * 失败返回结果
     * @param message 提示信息
     */
    public static <T> CommonResult<T> failed(String message) {
        return new CommonResult<T>(ErrorCode.FAILED.getRet(), message, null);
    }

    /**
     * 失败返回结果
     */
    public static <T> CommonResult<T> failed() {
        return failed(ErrorCode.FAILED);
    }

    /**
     * 参数验证失败返回结果
     */
    public static <T> CommonResult<T> validateFailed() {
        return failed(ErrorCode.VALIDATE_FAILED);
    }

    /**
     * 参数验证失败返回结果
     * @param message 提示信息
     */
    public static <T> CommonResult<T> validateFailed(String message) {
        return new CommonResult<T>(ErrorCode.VALIDATE_FAILED.getRet(), message, null);
    }

    /**
     * 未登录返回结果
     */
    public static <T> CommonResult<T> unauthorized(T data) {
        return new CommonResult<T>(ErrorCode.UNAUTHORIZED.getRet(), ErrorCode.UNAUTHORIZED.getMessage(), data);
    }

    public static <T> CommonResult<T> unauthorized() {
        return failed(ErrorCode.UNAUTHORIZED);
    }

    /**
     * 未授权返回结果
     */
    public static <T> CommonResult<T> forbidden(T data) {
        return new CommonResult<T>(ErrorCode.FORBIDDEN.getRet(), ErrorCode.FORBIDDEN.getMessage(), data);
    }

    public static <T> CommonResult<T> forbidden() {
        return failed(ErrorCode.FORBIDDEN);
    }

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
