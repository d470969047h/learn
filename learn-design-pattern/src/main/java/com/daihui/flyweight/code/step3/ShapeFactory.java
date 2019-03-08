package com.daihui.flyweight.code.step3;

import com.daihui.flyweight.code.step1.Shape;
import com.daihui.flyweight.code.step2.Circle;

import java.util.HashMap;

/**
 * @Description: 步骤 3 创建一个工厂，生成基于给定信息的实体类的对象。
 * @Date: Created in 17:13 2019-03-08
 * @Author: daihui
 * @Modified By:
 */
public class ShapeFactory {

    // * 关键代码：用 HashMap 存储这些对象。
    private static final HashMap<String, Shape> circleMap = new HashMap<String, Shape>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);
        if (null == circle) {
            circle = new Circle(color);
            // * 关键代码：用 HashMap 存储这些对象。
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
