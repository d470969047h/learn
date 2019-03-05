package com.daihui.decorator.code.step3;

import com.daihui.decorator.code.step1.Shape;

/**
 * @Description: 步骤 3 创建实现了 Shape 接口的抽象装饰类。
 * @Date: Created in 14:58 2019-03-05
 * @Author: daihui
 * @Modified By:
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratorShape;

    public ShapeDecorator(Shape decoratorShape) {
        this.decoratorShape = decoratorShape;
    }

    @Override
    public void draw() {
        if (null != decoratorShape) {
            decoratorShape.draw();
        }
    }
}
