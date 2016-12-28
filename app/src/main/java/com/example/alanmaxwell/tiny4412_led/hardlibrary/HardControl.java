package com.example.alanmaxwell.tiny4412_led.hardlibrary;

/**
 * Created by alanmaxwell on 16-12-28.
 */

public class HardControl {
    public static native int ledCtrl(int which,int status);
    public static native int ledOpen();
    public static native void ledClose();

    static {
        //加载C库
        try {
            System.loadLibrary("hardcontrol");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
