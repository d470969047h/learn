package com.daihui.facade.code.step3;

import com.daihui.facade.code.step1.ComputerModule;
import com.daihui.facade.code.step2.Cpu;
import com.daihui.facade.code.step2.HardDisk;
import com.daihui.facade.code.step2.Memory;

/**
 * @Description: 步骤 3 创建一个外观类。
 * @Date: Created in 10:39 2019-03-06
 * @Author: daihui
 * @Modified By:
 */
public class ComputerModuleMaker {

    ComputerModule cpu;
    ComputerModule memory;
    ComputerModule hardDisk;

    public ComputerModuleMaker(){
        cpu = new Cpu();
        memory = new Memory();
        hardDisk = new HardDisk();
    }

    public void open(){
        cpu.open();
        memory.open();
        hardDisk.open();
    }

    public void close(){
        cpu.close();
        memory.close();
        hardDisk.close();
    }
}
