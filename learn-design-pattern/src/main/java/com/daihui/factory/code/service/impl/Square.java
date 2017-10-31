package com.daihui.factory.code.service.impl;

import com.daihui.factory.code.service.Shape;

/**
 * 正方形--实现类
 * 470969043@qq.com
 *
 * @author daihui
 * @create 2016-09- 23:12
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("画了一个正方形！");
    }
}
