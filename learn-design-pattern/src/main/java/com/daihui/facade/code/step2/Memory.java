package com.daihui.facade.code.step2;

import com.daihui.facade.code.step1.ComputerModule;

/**
 * @Description: 步骤 2 创建实现接口的实体类。
 * @Date: Created in 10:36 2019-03-06
 * @Author: daihui
 * @Modified By:
 */
public class Memory implements ComputerModule {
    @Override
    public void open() {
        System.out.println("启动内存");
    }

    @Override
    public void close() {
        System.out.println("关闭内存");
    }
}
