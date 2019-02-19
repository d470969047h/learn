package com.daihui.bridge.code.step3;

import com.daihui.bridge.code.step1.DrawAPI;

/**
 * @Author: daihui
 * @Description: 步骤3：使用DrawAPI 接口创建抽象类Shape
 * @Date: Created in 16:58 2019-02-19
 * @Modified By:
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
