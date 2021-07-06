package com.gavin.spt.common.api;

public interface IError {
    /**
     * 返回码
     */
    int getRet();

    /**
     * 返回信息
     */
    String getMessage();
}
