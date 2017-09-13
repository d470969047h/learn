package com.daihui.builder.service;

/**
 * 步骤 1
 * 创建一个表示食物条目和食物包装的接口。
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2017/9/13.
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
