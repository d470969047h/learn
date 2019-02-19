package com.daihui.bridge.code.step5;

import com.daihui.bridge.code.step2.GreenCircle;
import com.daihui.bridge.code.step2.RedCircle;
import com.daihui.bridge.code.step3.Shape;
import com.daihui.bridge.code.step4.Circle;

/**
 * @Author: daihui
 * @Description: 步骤5：使用Shape和DrawAPI画出不同颜色的圆
 * @Date: Created in 17:09 2019-02-19
 * @Modified By:
 */
public class BridgePatternDemo {

    public static void main(String[] args) {

        Shape redCircle = new Circle(100,100,10,new RedCircle());
        Shape greenCircle = new Circle(10000,10000,100,new GreenCircle());

        redCircle.draw();
        greenCircle.draw();

    }
}
