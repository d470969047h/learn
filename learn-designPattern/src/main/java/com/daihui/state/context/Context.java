package com.daihui.state.context;

import com.daihui.state.service.IState;

/**
 * 创建 Context 类
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2016-09-06 10:50
 */
public class Context {

    private IState state;

    public Context(){
        state = null;
    }

    public void setState(IState state){
        this.state = state;
    }

    public IState getState(){
        return state;
    }
}
