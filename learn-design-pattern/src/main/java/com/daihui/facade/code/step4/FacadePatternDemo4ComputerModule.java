package com.daihui.facade.code.step4;

import com.daihui.facade.code.step3.ComputerModuleMaker;
import com.daihui.facade.code.step3.ShapeMaker;

/**
 * @Description: 步骤 4 使用该外观类画出各种类型的形状。
 * @Date: Created in 10:32 2019-03-06
 * @Author: daihui
 * @Modified By:
 */
public class FacadePatternDemo4ComputerModule {

    public static void main(String[] args) {
        ComputerModuleMaker computerModuleMaker = new ComputerModuleMaker();

        System.out.println("*打开计算机*");
        computerModuleMaker.open();
        System.out.println("*计算机已打开*");

        System.out.println("");

        System.out.println("*关闭计算机*");
        computerModuleMaker.close();
        System.out.println("*计算机已关闭*");
    }
}
