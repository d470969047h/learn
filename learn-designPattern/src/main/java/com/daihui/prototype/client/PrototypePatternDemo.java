package com.daihui.prototype.client;

import com.daihui.prototype.context.ShapeCache;
import com.daihui.prototype.service.BaseShape;

/**
 * 步骤 4
 * 使用 ShapeCache 类来获取存储在 Hashtable 中的形状的克隆
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2017/10/27.
 */
public class PrototypePatternDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        BaseShape clonedShape1 = ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape1.getType());
        clonedShape1.draw();

        BaseShape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());
        clonedShape2.draw();

        BaseShape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
        clonedShape3.draw();
    }
}
