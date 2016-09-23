package com.daihui.abstractFactory.factory;

import com.daihui.abstractFactory.interfaces.Color;
import com.daihui.abstractFactory.interfaces.Shape;

/**
 * 步骤5
 * 为Shape和Color对象创建抽象类来获取工厂
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2016-09-24 1:59
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
