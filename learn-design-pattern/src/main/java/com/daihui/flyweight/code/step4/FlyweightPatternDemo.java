package com.daihui.flyweight.code.step4;

import com.daihui.flyweight.code.step2.Circle;
import com.daihui.flyweight.code.step3.ShapeFactory;

/**
 * @Description: 步骤 4 使用该工厂，通过传递颜色信息来获取实体类的对象。
 * @Date: Created in 17:23 2019-03-08
 * @Author: daihui
 * @Modified By:
 */
public class FlyweightPatternDemo {

    private static final String[] colors = { "Red", "Green", "Blue", "White", "Black" };

    public static void main(String[] args) {
        for(int i=0; i < 30; ++i) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
