package com.daihui.flyweight.code.step2;

import com.daihui.flyweight.code.step1.Shape;

/**
 * @Description: 步骤 2 创建实现接口的实体类。
 * @Date: Created in 17:07 2019-03-08
 * @Author: daihui
 * @Modified By:
 */
public class Circle implements Shape {

    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color
                + ", x : " + x + ", y :" + y + ", radius :" + radius);
    }
}
