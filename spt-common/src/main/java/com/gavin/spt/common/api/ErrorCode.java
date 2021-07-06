package com.gavin.spt.common.api;

import java.util.Arrays;

public enum ErrorCode implements IError{
    FAILED(10008, "服务器错误"),
    VALIDATE_FAILED(10002, "参数检验失败"),
    UNAUTHORIZED(10401, "暂未登录或token已经过期"),
    FORBIDDEN(10403, "没有相关权限");

    private int ret;
    private String message;

    private ErrorCode(int ret, String message) {
        this.ret = ret;
        this.message = message;
    }


    @Override
    public int getRet() {
        return ret;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public static ErrorCode toEnum(int ret) {
        return Arrays.stream(ErrorCode.values()).filter(errorCode -> errorCode.getRet() == ret).findAny()
                .orElse(FAILED);
    }
}
