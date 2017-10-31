package com.daihui.builder.code.model;

import com.daihui.builder.code.service.impl.BaseColdDrink;

/**
 * 步骤 4
 * 创建扩展了 Burger 和 ColdDrink 的实体类。
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2017/9/13.
 */
public class Pepsi extends BaseColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}