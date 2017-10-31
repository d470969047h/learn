package com.daihui.factory.code.client;

import com.daihui.factory.code.factory.ShapeFactory;
import com.daihui.factory.code.service.Shape;

/**
 * 使用该工厂，通过传递类型信息来获取实体类的对象。
 * 470969043@qq.com
 *
 * @author daihui
 * @create 2016-09- 23:23
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        //获取 ShapeFactory 实例化对象
        ShapeFactory factory = new ShapeFactory();

        //获取 Circle 的对象，并调用它的 draw 方法
        Shape circle = factory.getShape("CIRCLE");
        circle.draw();

        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape rectangle = factory.getShape("RECTANGLE");
        rectangle.draw();

        //获取 Square 的对象，并调用它的 draw 方法
        Shape square = factory.getShape("SQUARE");
        square.draw();
    }
}
