package com.daihui.prototype.code.service.impl;

import com.daihui.prototype.code.service.BaseShape;

/**
 * 步骤 2
 * 创建扩展了上面抽象类的实体类。
 * 正方形
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2017/10/27.
 */
public class Square extends BaseShape {

    public Square() {
        type = "Square";
    }

    /**
     * 画正方形
     */
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
