package com.daihui.builder.entity;

import com.daihui.builder.service.impl.Burger;

/**
 * 步骤 4
 * 创建扩展了 Burger 和 ColdDrink 的实体类。
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2017/9/13.
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
