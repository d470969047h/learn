package com.daihui.state.code.service.impl;

import com.daihui.state.code.service.IState;
import com.daihui.state.code.context.Context;

/**
 * 创建实现接口的实体类--开始状态
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2016-09-06 10:47
 */
public class StartState  implements IState{

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString(){
        return "Stop State";
    }
}
