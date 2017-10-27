package com.daihui.singleton.other.lazy.safe;

/**
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2017/9/2.
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (null == instance) {
            instance = new Singleton();
        }
        return instance;
    }
}