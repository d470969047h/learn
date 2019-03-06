package com.daihui.facade.code.step4;

import com.daihui.facade.code.step3.ShapeMaker;

/**
 * @Description: 步骤 4 使用该外观类画出各种类型的形状。
 * @Date: Created in 10:32 2019-03-06
 * @Author: daihui
 * @Modified By:
 */
public class FacadePatternDemo4Shape {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
