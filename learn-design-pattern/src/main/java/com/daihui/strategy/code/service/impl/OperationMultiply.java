package com.daihui.strategy.code.service.impl;

import com.daihui.strategy.code.service.IStrategy;

/**
 * 乘法策略
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2016-09-06 16:57
 */
public class OperationMultiply implements IStrategy{

    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
