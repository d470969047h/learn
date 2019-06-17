package com.daihui.exercises.exercise1.chapter1;


import java.util.concurrent.TimeUnit;

/**
 * 资源类
 */
class MyData {

    volatile int number = 0;

    public void addTo10() {
        this.number = 10;
    }
}

/**
 * 1. 验证volatile的可见性
 * 1.1 设 int number = 0; 并无volatile关键字修饰，无可见性（主线程一直在等待）
 *
 * @Date: Created in 15:46 2019-06-17
 * @Author: daihui
 */
public class VolatileDemo {

    public static void main(String[] args) {

        // 资源类
        MyData myData = new MyData();

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "\t come in");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            myData.addTo10();
            System.out.println(Thread.currentThread().getName() + "\t updated number value: " + myData.number);
        }, "A").start();

        while (myData.number == 0) {
            // number时，主线程一直等待，直到主线程直到number被修改为10
        }

        System.out.println(Thread.currentThread().getName() + "\t mission is over, main get number value: " +myData.number);
    }
}
