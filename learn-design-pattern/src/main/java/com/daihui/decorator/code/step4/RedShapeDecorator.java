package com.daihui.decorator.code.step4;

import com.daihui.decorator.code.step1.Shape;
import com.daihui.decorator.code.step3.ShapeDecorator;

/**
 * @Description: 创建扩展了 ShapeDecorator 类的实体装饰类。
 * @Date: Created in 15:03 2019-03-05
 * @Author: daihui
 * @Modified By:
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        decoratorShape.draw();
        setRedBorder(decoratorShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("设置为红色");
    }
}
