package com.daihui.state.service.impl;

import com.daihui.state.service.IState;
import com.daihui.state.context.Context;

/**
 * 创建实现接口的实体类--开始状态
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2016-09-06 10:47
 */
public class StartState  implements IState{

    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
