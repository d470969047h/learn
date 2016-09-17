package com.daihui.thrift;

import org.apache.thrift.TException;

/**
 * 实现接口
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2016-09-17 14:30
 */
public class AdditionServiceHandler implements SubService.Iface {
    @Override
    public int add(int n1, int n2) throws TException {
        return n1 + n2;
    }

    @Override
    public int sub(int n1, int n2) throws TException {
        return n1 - n2;
    }
}
