package com.daihui.abstractfactory.code.service.impl;

import com.daihui.abstractfactory.code.service.Shape;

/**
 * 步骤 2
 * 创建正方形实现shape接口
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2016-09-24 1:43
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
