package com.daihui.abstractfactory.code.factory;

import com.daihui.abstractfactory.code.service.Color;
import com.daihui.abstractfactory.code.service.Shape;

/**
 * 步骤5
 * 为Shape和Color对象创建抽象类来获取工厂
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2016-09-24 1:59
 */
public abstract class AbstractFactory {
    /**
     * 得到颜色
     * @param color
     * @return
     */
    public abstract Color getColor(String color);

    /**
     * 得到形状
     * @param shape
     * @return
     */
    public abstract Shape getShape(String shape);
}
