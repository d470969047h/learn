package com.daihui.strategy.client;

import com.daihui.strategy.context.Context;
import com.daihui.strategy.service.impl.OperationAdd;
import com.daihui.strategy.service.impl.OperationMultiply;
import com.daihui.strategy.service.impl.OperationSubstract;

/**
 * 策略模式客户端调用
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2016-09-06 17:08
 */
public class StrategyPatternDemo {

    public static void main(String[] args) {

        System.out.println("对整型数4和5作相应策略运算结果如下：");

        Context context = new Context(new OperationAdd());
        System.out.println("加法策略: 4+5= "+context.executeStrategy(4,5));

        context = new Context(new OperationSubstract());
        System.out.println("减法策略: 4-5="+context.executeStrategy(4,5));

        context = new Context(new OperationMultiply());
        System.out.println("乘法策略: 4*5="+context.executeStrategy(4,5));
    }
}
