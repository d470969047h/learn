package com.daihui.other;


import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ShareData {
    private int number = 1;
    private Lock lock = new ReentrantLock();

    Condition conditionA = lock.newCondition();
    Condition conditionB = lock.newCondition();
    Condition conditionC = lock.newCondition();

    public void print5() {
        lock.lock();
        try {
            while (number != 1) {
                conditionA.await();
            }
            number = 2;
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
            conditionB.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void print10() {
        lock.lock();
        try {
            while (number != 2) {
                conditionB.await();
            }
            number = 3;
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
            conditionC.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void print15() {
        lock.lock();
        try {
            while (number != 3) {
                conditionC.await();
            }
            number = 1;
            for (int i = 1; i <= 15; i++) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
            conditionA.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }


    public void prints(int index) {
        if (index == 5) {
            print5();
        }
        if (index == 10) {
            print10();
        }
        if (index == 15) {
            print15();
        }
    }

}

/**
 * 多线程顺序调用，A->B->C
 * A打印5次，B打印10次，C打印15次
 * 10次循环
 */
public class ConditionDemo {

    public static void main(String[] args) {
        ShareData shareData = new ShareData();

//        new Thread(()->{
//            for (int i = 0; i < 10; i++) {
//                shareData.print5();
//            }
//        },"A").start();
//
//        new Thread(()->{
//            for (int i = 0; i < 10; i++) {
//                shareData.print10();
//            }
//        },"B").start();
//
//        new Thread(()->{
//            for (int i = 0; i < 10; i++) {
//                shareData.print15();
//            }
//        },"C").start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                shareData.prints(5);
            }
        }, "AA").start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                shareData.prints(10);
            }
        }, "BB").start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                shareData.prints(15);
            }
        }, "CC").start();
    }
}
