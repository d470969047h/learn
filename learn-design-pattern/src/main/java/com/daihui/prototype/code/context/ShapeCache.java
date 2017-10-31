package com.daihui.prototype.code.context;

import com.daihui.prototype.code.service.BaseShape;
import com.daihui.prototype.code.service.impl.Circle;
import com.daihui.prototype.code.service.impl.Rectangle;
import com.daihui.prototype.code.service.impl.Square;

import java.util.Hashtable;

/**
 * 步骤 3
 * 创建一个类，从数据库获取实体类，并把它们存储在一个 Hashtable 中
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2017/10/27.
 */
public class ShapeCache {

    private static Hashtable<String,BaseShape> shapeMap = new Hashtable<String, BaseShape>();

    public static BaseShape getShape(String shapeId) {
        BaseShape cachedShape = shapeMap.get(shapeId);
        return (BaseShape) cachedShape.clone();
    }

    /**
     * 对每种形状都进行数据库查询，并创建该形状
     * shapeMap.put(shapeKey,shape);
     * 例如，我们要添加三种形状
     */
    public static void loadCache() {

        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
