package com.daihui.juc;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 资源类
 */
class Ticket {
    private int number = 30;

    Lock lock = new ReentrantLock();

    public void sale() {
        lock.lock();
        try {
            if (number > 0) {
                System.out.println(Thread.currentThread().getName() + "\t卖出第：" + (number--) + "\t还剩下：" + number);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}


/**
 * 线程        操作   资源类
 * 3个售票员    卖    30张票
 *
 * @Date: Created in 9:17 下午 2019/10/25
 * @Author: daihui
 * @Modified By:
 */
public class SaleTicketDemo01 {


    public static void main(String[] args) {
        // 资源类
        Ticket ticket = new Ticket();


        // 线程
        new Thread(()->{ for (int i = 0; i < 40; i++) ticket.sale();},"售票员1").start();
        new Thread(()->{ for (int i = 0; i < 40; i++) ticket.sale();},"售票员2").start();
        new Thread(()->{ for (int i = 0; i < 40; i++) ticket.sale();},"售票员3").start();
    }
}
