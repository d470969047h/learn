package com.daihui.facade.code.step3;

import com.daihui.facade.code.step1.Shape;
import com.daihui.facade.code.step2.Circle;
import com.daihui.facade.code.step2.Rectangle;
import com.daihui.facade.code.step2.Square;

/**
 * @Description: 步骤 3 创建一个外观类。
 * @Date: Created in 10:28 2019-03-06
 * @Author: daihui
 * @Modified By:
 */
public class ShapeMaker {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker(){
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawSquare(){
        square.draw();
    }

}
