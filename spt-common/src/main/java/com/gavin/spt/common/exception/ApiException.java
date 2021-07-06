package com.gavin.spt.common.exception;

import com.gavin.spt.common.api.IError;

/**
 * 自定义API异常
 */
public class ApiException extends RuntimeException {
    private IError error;

    public ApiException(IError error) {
        super(error.getMessage());
        this.error = error;
    }

    public ApiException(String message) {
        super(message);
    }

    public ApiException(Throwable cause) {
        super(cause);
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public IError getError() {
        return error;
    }
}
