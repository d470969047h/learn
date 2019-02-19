package com.daihui.bridge.code.step4;

import com.daihui.bridge.code.step1.DrawAPI;
import com.daihui.bridge.code.step3.Shape;

/**
 * @Author: daihui
 * @Description: 步骤4：创建实现了Shape接口的实现类
 * @Date: Created in 17:01 2019-02-19
 * @Modified By:
 */
public class Circle extends Shape {

    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}

