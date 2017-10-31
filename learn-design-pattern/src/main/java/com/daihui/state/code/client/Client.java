package com.daihui.state.code.client;

import com.daihui.state.code.service.impl.StartState;
import com.daihui.state.code.service.impl.StopState;
import com.daihui.state.code.context.Context;

/**
 * 客户端
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2016-09-06 10:54
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
