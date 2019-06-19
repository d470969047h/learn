package com.daihui.exercises.exercise1.chapter2;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description:
 * @Date: Created in 20:40 2019-06-17
 * @Author: daihui
 *
 * 1. CAS 是什么？
 *      比较并交换
 */
public class CASDemo {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(10);

        System.out.println(atomicInteger.compareAndSet(10, 100) + "\t current data: " + atomicInteger.get());
        System.out.println(atomicInteger.compareAndSet(10, 200) + "\t current data: " + atomicInteger.get());
    }
}
