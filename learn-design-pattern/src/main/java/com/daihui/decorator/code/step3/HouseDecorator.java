package com.daihui.decorator.code.step3;

import com.daihui.decorator.code.step1.House;

/**
 * @Description: 步骤 3 创建实现了 House 接口的抽象装饰类。
 * @Date: Created in 15:42 2019-03-05
 * @Author: daihui
 * @Modified By:
 */
public abstract class HouseDecorator implements House {
    protected House house;

    public HouseDecorator(House house) {
        this.house = house;
    }

    @Override
    public void live() {
        if (null != house){
            house.live();
        }
    }
}
