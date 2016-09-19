package com.daihui.factory.service.impl;

import com.daihui.factory.service.Shape;

/**
 * 矩形--实现类
 * 470969043@qq.com
 *
 * @author daihui
 * @create 2016-09- 23:07
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("画了一个矩形！");
    }
}
