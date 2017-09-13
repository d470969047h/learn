package com.daihui.builder.service.impl;

import com.daihui.builder.service.Packing;

/**
 * 步骤 2
 * 瓶子
 * 创建实现 Packing 接口的实体类。
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2017/9/13.
 */
public class Bottle implements Packing {

    public String pack() {
        return "Bottle（瓶子）";
    }
}
