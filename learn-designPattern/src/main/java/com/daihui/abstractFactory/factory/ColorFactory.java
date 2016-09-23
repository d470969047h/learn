package com.daihui.abstractFactory.factory;

import com.daihui.abstractFactory.interfaces.Color;
import com.daihui.abstractFactory.interfaces.Shape;
import com.daihui.abstractFactory.interfaces.impl.Blue;
import com.daihui.abstractFactory.interfaces.impl.Green;
import com.daihui.abstractFactory.interfaces.impl.Red;

/**
 * 步骤 6
 * 颜色工厂
 * 创建扩展了 AbstractFactory 的工厂类，基于给定的信息生成实体类的对象。
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2016-09-24 2:08
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
