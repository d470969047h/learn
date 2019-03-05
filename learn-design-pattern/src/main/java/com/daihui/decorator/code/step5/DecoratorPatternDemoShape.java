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
public class DecoratorPatternDemoShape {

    public static void main(String[] args) {

        House house = new RoughcastHouse();
        house.live();
        System.out.println("--装修毛坯房--：");
        House decorateHouse = new DecorateHouseDecorator(house);
        decorateHouse.live();
        System.out.println("--为毛坯房配置家电--：");
        House configureFurniture = new ConfigureFurnitureDecorator(decorateHouse);
        configureFurniture.live();

        System.out.println("\n");
        House hardcoverRoom = new HardcoverRoom();
        hardcoverRoom.live();
        System.out.println("--装修精装房--：");
        House decorateHouseRoom = new DecorateHouseDecorator(hardcoverRoom);
        decorateHouseRoom.live();
        System.out.println("--为精装房配置家电--：");
        House configureFurnitureRoom = new ConfigureFurnitureDecorator(decorateHouseRoom);
        configureFurnitureRoom.live();

    }
}
