package com.daihui.singleton.other.dcl;

/**
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2017/9/2.
 */
public class Singleton {

    private volatile static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {

        if (null == instance) {
            synchronized (Singleton.class) {
                if (null == instance) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
