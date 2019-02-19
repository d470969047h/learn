package com.daihui.bridge.code.step2;

import com.daihui.bridge.code.step1.DrawAPI;

/**
 * @Author: daihui
 * @Description: 步骤 2 创建实现了 DrawAPI 接口的实体桥接实现类。
 * @Date: Created in 16:35 2019-02-19
 * @Modified By:
 */
public class GreenCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, redius:" + radius + ", x: " + x + ", y: " + y + "]");
    }
}
