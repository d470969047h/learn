package com.daihui.java8.util;

import com.daihui.java8.part.one.chapter1.Apple;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: Demo数据获取
 * @Date: Created in 14:12 2019-03-29
 * @Author: daihui
 * @Modified By:
 */
public class DataUitl {

    /**
     * 生成三个苹果
     * @return
     */
    public static List<Apple> createApples() {
        List<Apple> appleList = new ArrayList<>();
        appleList.add(new Apple("red", 150L));
        appleList.add(new Apple("green", 170L));
        appleList.add(new Apple("yellow", 160L));
        return appleList;
    }

}
