package com.daihui.abstractfactory.code.factory;

import com.daihui.abstractfactory.code.service.Color;
import com.daihui.abstractfactory.code.service.Shape;
import com.daihui.abstractfactory.code.service.impl.Blue;
import com.daihui.abstractfactory.code.service.impl.Green;
import com.daihui.abstractfactory.code.service.impl.Red;

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

    private static final String RED = "RED";
    private static final String GREEN = "GREEN";
    private static final String BLUE = "BLUE";


    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (RED.equalsIgnoreCase(color)) {
            return new Red();
        } else if (GREEN.equalsIgnoreCase(color)) {
            return new Green();
        } else if (BLUE.equalsIgnoreCase(color)) {
            return new Blue();
        }
        return null;
    }


    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
