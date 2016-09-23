package com.daihui.abstractFactory.factory;

/**
 * 步骤 7
 * 创建一个工厂创造器/生成器类，通过传递形状或颜色信息来获取工厂。
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2016-09-24 2:12
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}