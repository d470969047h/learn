package com.daihui.decorator.code.step4;

import com.daihui.decorator.code.step1.House;
import com.daihui.decorator.code.step3.HouseDecorator;

/**
 * @Description: 创建扩展了 HouseDecorator 类的实体装饰类。
 * @Date: Created in 15:45 2019-03-05
 * @Author: daihui
 * @Modified By:
 */
public class DecorateHouseDecorator extends HouseDecorator {

    public DecorateHouseDecorator(House house) {
        super(house);
    }

    @Override
    public void live() {
        super.live();
        System.out.println("装修房子");
    }
}
