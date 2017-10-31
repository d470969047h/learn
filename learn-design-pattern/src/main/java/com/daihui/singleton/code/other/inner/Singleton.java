package com.daihui.singleton.code.other.inner;

/**
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2017/9/2.
 */
public class Singleton {

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    private Singleton() {}

    public static final Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
