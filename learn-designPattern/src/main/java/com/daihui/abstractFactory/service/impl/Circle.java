package com.daihui.abstractFactory.service.impl;

import com.daihui.abstractFactory.service.Shape;

/**
 * 步骤 2
 * 创建圆形实现shape接口
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2016-09-24 1:45
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
