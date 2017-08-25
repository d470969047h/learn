package com.daihui.abstractFactory.factory;

import com.daihui.abstractFactory.service.Color;
import com.daihui.abstractFactory.service.Shape;
import com.daihui.abstractFactory.service.impl.Circle;
import com.daihui.abstractFactory.service.impl.Rectangle;
import com.daihui.abstractFactory.service.impl.Square;

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
        if (shapeType.equals("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
