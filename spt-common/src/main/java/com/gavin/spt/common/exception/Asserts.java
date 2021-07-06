package com.gavin.spt.common.exception;

import com.gavin.spt.common.api.IError;

/**
 * 断言处理类，用于抛出各种API异常
 */
public class Asserts {
    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IError error) {
        throw new ApiException(error);
    }
}
