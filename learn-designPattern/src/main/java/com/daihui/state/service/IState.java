package com.daihui.state.service;

import com.daihui.state.context.Context;

/**
 * 接口
 * 470969043@qq.com
 *
 * @author daihui
 * @create 2016-09-06 10:46
 */
public interface IState {

    /**
     * 状态功能
     * @param context
     */
    void doAction(Context context);
}
