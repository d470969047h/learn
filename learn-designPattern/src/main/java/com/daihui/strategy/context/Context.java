package com.daihui.strategy.context;

import com.daihui.strategy.service.IStrategy;

/**
 * 使用了某种策略的类（上下文）
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2016-09-06 17:04
 */
public class Context {

    private IStrategy strategy;

    public Context(IStrategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1,int num2){
        return strategy.doOperation(num1,num2);
    }
}
