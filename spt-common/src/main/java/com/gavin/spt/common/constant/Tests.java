package com.gavin.spt.common.constant;

import com.gavin.spt.common.api.ErrorCode;

public class Tests {
    public static void main(String[] args) {
        System.out.println(StateEnum.toEnum("up"));
        System.out.println(ErrorCode.toEnum(10403));
    }
}
