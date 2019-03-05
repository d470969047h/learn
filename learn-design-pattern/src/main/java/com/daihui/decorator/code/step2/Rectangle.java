package com.daihui.decorator.code.step2;

import com.daihui.decorator.code.step1.Shape;

/**
 * @Description: 步骤 2 创建实现接口的实体类。
 * @Date: Created in 14:56 2019-03-05
 * @Author: daihui
 * @Modified By:
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("画了一个矩形");
    }
}
