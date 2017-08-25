package com.daihui.abstractFactory.service.impl;

import com.daihui.abstractFactory.service.Color;

/**
 * 步骤4
 * 红色
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2016-09-24 1:54
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
