package com.daihui.factory.factory;

import com.daihui.factory.service.Shape;
import com.daihui.factory.service.impl.Circle;
import com.daihui.factory.service.impl.Rectangle;
import com.daihui.factory.service.impl.Square;

/**
 * 创建一个工厂，生成基于给定信息的实体类的对象。
 * 470969043@qq.com
 *
 * @author daihui
 * @create 2016-09- 23:16
 */
public class ShapeFactory {

    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType){
        if(null == shapeType){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
