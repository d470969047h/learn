package com.daihui.factory.code.factory;

import com.daihui.factory.code.service.Shape;
import com.daihui.factory.code.service.impl.Circle;
import com.daihui.factory.code.service.impl.Rectangle;
import com.daihui.factory.code.service.impl.Square;

/**
 * 创建一个工厂，生成基于给定信息的实体类的对象。
 * 470969043@qq.com
 *
 * @author daihui
 * @create 2016-09- 23:16
 */
public class ShapeFactory {

    private static final String CIRCLE = "CIRCLE";
    private static final String RECTANGLE = "RECTANGLE";
    private static final String SQUARE = "SQUARE";

    /**
     * 使用 getShape 方法获取形状类型的对象
     * @param shapeType 形状类型
     * @return 具体形状
     */
    public Shape getShape(String shapeType){
        if(null == shapeType){
            return null;
        }
        if(CIRCLE.equalsIgnoreCase(shapeType)){
            return new Circle();
        }
        if(RECTANGLE.equalsIgnoreCase(shapeType)){
            return new Rectangle();
        }
        if(SQUARE.equalsIgnoreCase(shapeType)){
            return new Square();
        }
        return null;
    }
}
