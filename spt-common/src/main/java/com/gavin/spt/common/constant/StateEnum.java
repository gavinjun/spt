package com.gavin.spt.common.constant;

import com.google.common.base.Strings;

public enum StateEnum {
    UP,
    UNKNOWN;


//    private String des;
//    StateEnum(String des) {
//        this.des = des;
//    }
//
//    public String getDes() {
//        return des;
//    }
//
//    public void setDes(String des) {
//        this.des = des;
//    }
    public static StateEnum toEnum(String s) {
        if (!Strings.isNullOrEmpty(s)) {
            try {
                return StateEnum.valueOf(s.toUpperCase());
            } catch (IllegalArgumentException e) {
//            e.printStackTrace();
            }
        }
        return UNKNOWN;
    }
}
