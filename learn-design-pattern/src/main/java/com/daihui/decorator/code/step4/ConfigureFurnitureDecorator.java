package com.daihui.decorator.code.step4;

import com.daihui.decorator.code.step1.House;
import com.daihui.decorator.code.step3.HouseDecorator;

/**
 * @Description: 创建扩展了 HouseDecorator 类的实体装饰类。
 * @Date: Created in 15:50 2019-03-05
 * @Author: daihui
 * @Modified By:
 */
public class ConfigureFurnitureDecorator extends HouseDecorator {

    public ConfigureFurnitureDecorator(House house) {
        super(house);
    }

    @Override
    public void live() {
        super.live();
        configureFurniture();
    }

    private void configureFurniture(){
        System.out.println("配置/升级家电");
    }
}
