package com.daihui.abstractFactory.interfaces.impl;

import com.daihui.abstractFactory.interfaces.Color;

/**
 * 步骤4
 * 绿色
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2016-09-24 1:55
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
