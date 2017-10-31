package com.daihui.builder.code.service.impl;

import com.daihui.builder.code.service.Item;
import com.daihui.builder.code.service.Packing;

/**
 * 步骤 3
 * 创建实现 Item 接口的抽象类，该类提供了默认的功能。
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2017/9/13.
 */
public abstract class BaseColdDrink implements Item {

    @Override
    public Packing packing(){
        return new Bottle();
    }

    /**
     * 价格
     * @return
     */
    @Override
    public abstract float price();

}
