package com.daihui.builder.code.service;

/**
 * 步骤 1
 * 创建一个表示食物条目和食物包装的接口。
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2017/9/13.
 */
public interface Item {

    /**
     * 名称
     * @return
     */
    String name();

    /**
     * 包装
     * @return
     */
    Packing packing();

    /**
     * 价格
     * @return
     */
    float price();
}
