package com.daihui.strategy.service;

/**
 * 策略接口
 * 470969043@qq.com
 *
 * @author daihui
 * @create 2016-09-06 16:53
 */
public interface IStrategy {

    /**
     * 操作
     * @param num1
     * @param num2
     * @return
     */
    int doOperation(int num1, int num2);
}
