package com.daihui.factory.code.service.impl;

import com.daihui.factory.code.service.Shape;

/**
 * 圆形--实现类
 * 470969043@qq.com
 *
 * @author daihui
 * @create 2016-09- 23:13
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("画了一个圆形！");
    }
}
