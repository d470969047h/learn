package com.daihui.decorator.code.step5;

import com.daihui.decorator.code.step1.Shape;
import com.daihui.decorator.code.step2.Circle;
import com.daihui.decorator.code.step2.Rectangle;
import com.daihui.decorator.code.step4.RedShapeDecorator;

/**
 * @Description: 步骤 5 使用 RedShapeDecorator 来装饰 Shape 对象。
 * @Date: Created in 15:19 2019-03-05
 * @Author: daihui
 * @Modified By:
 */
public class DecoratorPatternDemoShape {

    public static void main(String[] args) {

        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("普通圆形：");
        circle.draw();


        System.out.println("\n红色的圆：");
        redCircle.draw();

        System.out.println("\n红色的矩形：");
        redRectangle.draw();
    }
}
