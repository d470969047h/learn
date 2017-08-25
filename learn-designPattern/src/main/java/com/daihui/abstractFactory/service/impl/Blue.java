package com.daihui.abstractFactory.service.impl;

import com.daihui.abstractFactory.service.Color;

/**
 * 步骤4
 * 蓝色
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2016-09-24 1:56
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
