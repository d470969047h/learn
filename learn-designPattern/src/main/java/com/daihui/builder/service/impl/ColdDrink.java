package com.daihui.builder.service.impl;

import com.daihui.builder.service.Item;
import com.daihui.builder.service.Packing;
import com.daihui.builder.service.impl.Bottle;

/**
 * 步骤 3
 * 创建实现 Item 接口的抽象类，该类提供了默认的功能。
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2017/9/13.
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing(){
        return new Bottle();
    }

    @Override
    public abstract float price();

}
