package com.daihui.prototype.code.service.impl;

import com.daihui.prototype.code.service.BaseShape;

/**
 * 步骤 2
 * 创建扩展了上面抽象类的实体类。
 * 矩形
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2017/10/27.
 */
public class Rectangle extends BaseShape {

    public Rectangle() {
        type = "Rectangle";
    }

    /**
     * 画矩形
     */
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
