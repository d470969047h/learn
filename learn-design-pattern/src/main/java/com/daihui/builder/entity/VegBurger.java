package com.daihui.builder.entity;

import com.daihui.builder.service.impl.BaseBurger;

/**
 * 步骤 4
 * 创建扩展了 Burger 和 ColdDrink 的实体类。
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2017/9/13.
 */
public class VegBurger extends BaseBurger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
