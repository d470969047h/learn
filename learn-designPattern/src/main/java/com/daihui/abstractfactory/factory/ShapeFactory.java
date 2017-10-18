package com.daihui.abstractfactory.factory;

import com.daihui.abstractfactory.service.Color;
import com.daihui.abstractfactory.service.Shape;
import com.daihui.abstractfactory.service.impl.Circle;
import com.daihui.abstractfactory.service.impl.Rectangle;
import com.daihui.abstractfactory.service.impl.Square;

/**
 * 步骤 6
 * 形状工厂
 * 创建扩展了 AbstractFactory 的工厂类，基于给定的信息生成实体类的对象。
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2016-09-24 2:02
 */
public class ShapeFactory extends AbstractFactory {


    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {

        if(null==shapeType){
            return null;
        }
        if ("CIRCLE".equals(shapeType)) {
            return new Circle();
        } else if ("RECTANGLE".equalsIgnoreCase(shapeType)) {
            return new Rectangle();
        } else if ("SQUARE".equalsIgnoreCase(shapeType)) {
            return new Square();
        }
        return null;
    }
}
