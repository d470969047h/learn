package com.daihui.decorator.code.step2;

import com.daihui.decorator.code.step1.House;

/**
 * @Description: 步骤 2 创建实现接口的实体类：毛坯房(等待扩展的类)
 * @Date: Created in 15:37 2019-03-05
 * @Author: daihui
 * @Modified By:
 */
public class RoughcastHouse implements House {

    @Override
    public void live() {
        System.out.println("住在毛坯房");
    }
}
