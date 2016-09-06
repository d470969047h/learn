package com.daihui.strategy.service.impl;

import com.daihui.strategy.service.IStrategy;

/**
 * 加法策略
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2016-09-06 16:57
 */
public class OperationAdd implements IStrategy{

    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
