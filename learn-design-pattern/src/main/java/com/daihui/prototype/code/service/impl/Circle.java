package com.daihui.prototype.code.service.impl;

import com.daihui.prototype.code.service.BaseShape;

/**
 * 步骤 2
 * 创建扩展了上面抽象类的实体类。
 * 圆形
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2017/10/27.
 */
public class Circle extends BaseShape {

    public Circle() {
        type = "Circle";
    }

    /**
     * 画圆形
     */
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
