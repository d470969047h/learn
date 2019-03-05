package com.daihui.decorator.code.step5;

import com.daihui.decorator.code.step1.House;
import com.daihui.decorator.code.step2.HardcoverRoom;
import com.daihui.decorator.code.step2.RoughcastHouse;
import com.daihui.decorator.code.step4.ConfigureFurnitureDecorator;
import com.daihui.decorator.code.step4.DecorateHouseDecorator;

/**
 * @Description: 步骤 5 使用 ConfigureFurnitureDecorator和DecorateHouseDecorator 来装饰 House 对象。
 * @Date: Created in 15:19 2019-03-05
 * @Author: daihui
 * @Modified By:
 */
public class DecoratorPatternDemoHouse {

    public static void main(String[] args) {

        House house = new RoughcastHouse("天津实地海棠雅著");
        House decorateHouse = new DecorateHouseDecorator(house);
        House configureFurniture = new ConfigureFurnitureDecorator(decorateHouse);
        configureFurniture.live();

        System.out.println("\n");
        House hardcoverRoom = new HardcoverRoom("昆明市万彩城");
        House configureFurnitureRoom = new ConfigureFurnitureDecorator(hardcoverRoom);
        configureFurnitureRoom.live();

    }
}
