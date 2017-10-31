package com.daihui.abstractfactory.code.factory;

/**
 * 步骤 7
 * 创建一个工厂创造器/生成器类，通过传递形状或颜色信息来获取工厂。
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2016-09-24 2:12
 */
public class FactoryProducer {

    private static final String SHAPE = "SHAPE";
    private static final String COLOR = "COLOR";

    public static AbstractFactory getFactory(String choice) {
        if (SHAPE.equalsIgnoreCase(choice)) {
            return new ShapeFactory();
        } else if (COLOR.equalsIgnoreCase(choice)) {
            return new ColorFactory();
        }
        return null;
    }
}
