package com.ywl532.jnithread;

/**
 * Created by ywl on 2017-11-30.
 */

public class JniThread {

    static
    {
        System.loadLibrary("jnithread");
    }

    public native void normalThread();

}
