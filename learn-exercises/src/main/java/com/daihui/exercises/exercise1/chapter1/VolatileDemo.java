package com.daihui.exercises.exercise1.chapter1;


import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 资源类
 */
class MyData {

    volatile int number = 0;

    public void addTo10() {
        this.number = 10;
    }

    /**
     * 此时number有volatile关键字修饰
     */
    public void addPlusPlus(){
        number ++;
    }

    /**
     * 原子类，保证原子性
     */
    AtomicInteger atomicInteger = new AtomicInteger();

    public void addMyAtomic(){
        atomicInteger.getAndIncrement();
    }
}

/**
 * 1. 验证volatile的可见性 -> seeOkByVolatile()方法
 *    1.1 设 int number = 0; 并无volatile关键字修饰，无可见性（主线程一直在等待）
 *    1.2 添加volatile可以解决可见性问题
 *
 * 2. 验证volatile不保证原子性
 *    2.1 原子性指的是什么？
 *        不可分割，完整性。即某个线程在做某个具体业务时，中间不可被加塞活分割，需要整体完整，需要同时成功或失败
 *
 *    2.2 volatile不保证原子性案例演示 -> withoutGuaranteeAtomic()方法
 *
 *    2.3 为什么不能保证原子性 -> T1.java
 *
 *    2.4 如何解决不能保证原子性的问题？
 *        * 加 synchronized
 *        * 使用 AtomicInteger 原子类
 *
 *
 *
 * @Date: Created in 15:46 2019-06-17
 * @Author: daihui
 */
public class VolatileDemo {

    public static void main(String[] args) {

        MyData myData = new MyData();
        withoutGuaranteeAtomic(myData);
    }



    /**
     * 不能保证原子性
     */
    public static void withoutGuaranteeAtomic(MyData myData) {
        for(int i = 1; i <= 20; i++){
            new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    myData.addPlusPlus();
                    myData.addMyAtomic();
                }
            },String.valueOf(i)).start();
        }

        // 等待上面20个线程执行完后用mian线程获取最终结果是多少
        // 默认线程：主线和后台的gc线程
        while (Thread.activeCount() > 2){
            Thread.yield();
        }

        System.out.println(Thread.currentThread().getName() + " int type finally number value: " + myData.number);

        System.out.println(Thread.currentThread().getName() + " AtomicInteger type finally number value: " + myData.atomicInteger);
    }



    /**
     * volatile可保证可见性，及时同事其他线程，主物理内存的值已被修改
     */
    public static void seeOkByVolatile() {
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
