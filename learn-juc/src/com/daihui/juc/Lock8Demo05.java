package com.daihui.juc;


import java.util.concurrent.TimeUnit;

class Phone {

    public synchronized void sendEmail() throws Exception {
        TimeUnit.SECONDS.sleep(2L);
        System.out.println("----sendEmail----");
    }

    public synchronized void sendSMS() throws Exception {
        System.out.println("----sendSMS----");
    }

    public void sayHello() throws Exception {
        System.out.println("---sayHello---");
    }
}

/**
 * 一个对象里面如果有多个synchronized方法，某一个时刻内，只要一个线程去调用其中的一个synchronized方法，
 * 其他的线程都只能等待，也就是说某一时刻内，只能有唯一一个线程去访问这些synchronized方法
 * 锁的是当前对象this，被锁定后，其他的线程都不能进入到当前对象的其他synchronized方法
 * 加个普通方法后发现和同步锁无关
 * 换成两个对象后，不是通一把锁了，情况立即发生变化
 * 都换成静态同步方法后，情况有变化
 * 所有的非静态同步方法用的都是同一把锁----实例对象本身
 *
 * synchronized实现同步的基础：Java中的每一个对象都可以作为锁
 * 具体变现为以下3种形式
 * 1.对于普通同步方法，锁是当前实例对象
 * 2.对于同步方法快，锁是synchronized括号里配置的对象
 * 3.对于静态同步方法，锁是当前类的Class对象
 *
 * 当一个线程试图访问同步代码块时，它首先必须先得到锁，退出或抛出异常时必须释放锁
 * 即如果一个实例对象的非静态同步方法获得锁后，该实例对象的其他非静态同步方法必须等待获取锁的方法释放后才能获取锁，
 * 可是别的实例对象的非静态同步因为跟该实例对象的非静态同步方法用的是不同的锁，
 * 所以无须等待该实例对象已获取锁的非静态同步方法释放锁就可以获取他们自己的锁。
 *
 * 所有的静态同步方法用的也是同一把锁----类对象Class本身，
 * 这两把锁是两个不同的对象，所以静态同步方法与非静态同步方法之间是不会有竞态条件的。
 * 但是一旦一个静态同步方法获取锁后，其他静态同步方法都必须等待方法释放锁后才能获取锁，
 * 而不管是同一个实例对象的静态同步方法之间还是不同的实例对象的静态同步方法之间，只要他们是同一个类的实例对象
 */
public class Lock8Demo05 {

    public static void main(String[] args) {

        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        new Thread(()-> {
            try {
                phone1.sendEmail();
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"A").start();

        try {
            TimeUnit.SECONDS.sleep(2L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(()->{
            try {
//                phone2.sendSMS();
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"B").start();
    }
}
