package com.daihui.facade.code.step2;

import com.daihui.facade.code.step1.Shape;

/**
 * @Description: 步骤 2 创建实现接口的实体类。
 * @Date: Created in 10:25 2019-03-06
 * @Author: daihui
 * @Modified By:
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("画了一个圆形");
    }
}
