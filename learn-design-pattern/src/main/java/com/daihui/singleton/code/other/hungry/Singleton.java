package com.daihui.singleton.code.other.hungry;

/**
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2017/9/2.
 */
public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }
}
