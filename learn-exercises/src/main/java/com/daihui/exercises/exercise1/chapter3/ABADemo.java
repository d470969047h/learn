package com.daihui.exercises.exercise1.chapter3;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * @Description:
 * @Date: Created in 13:43 2019-06-19
 * @Author: daihui
 * @Modified By:
 */
public class ABADemo {

    /**
     * 对于整型：ABA问题Integer类型主要体现在[-128,127]区间
     */
    static AtomicReference<Integer> ar = new AtomicReference<>(-128);
    static AtomicStampedReference<Integer> asr = new AtomicStampedReference<>(100,1);

    public static void main(String[] args) {
        System.out.println("==========ABA问题产生============");
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"\t" +ar.compareAndSet(-128,100)+"\t" +ar.get());
            System.out.println(Thread.currentThread().getName()+"\t" +ar.compareAndSet(100,-128)+"\t" +ar.get());
        },"T1").start();

        new Thread(()->{
            try { TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) { e.printStackTrace(); }
            System.out.println(Thread.currentThread().getName()+"\t" +ar.compareAndSet(-128,888)+"\t" +ar.get());
        },"T2").start();

//===================================================================================================================================

        try { TimeUnit.SECONDS.sleep(2); } catch (InterruptedException e) { e.printStackTrace(); }
        System.out.println("==========ABA问题解决============");

        new Thread(()->{
            int stamp = asr.getStamp();
            System.out.println(Thread.currentThread().getName() + " 第一次版本号: "+stamp);
            try { TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) { e.printStackTrace(); }
            System.out.println(Thread.currentThread().getName()+"\t"+"修改前为："+asr.getReference()+"\t是否修改成功："+asr.compareAndSet(100, 101, stamp, stamp + 1)+"\t修改后为："+asr.getReference()+"\t当前最新版本号: "+asr.getStamp());
            System.out.println(Thread.currentThread().getName()+"\t"+"修改前为："+asr.getReference()+"\t是否修改成功："+asr.compareAndSet(101, 100, asr.getStamp(), asr.getStamp() + 1)+"\t修改后为："+asr.getReference()+"\t当前最新版本号: "+asr.getStamp());
        },"T3").start();

        new Thread(()->{
            int stamp = asr.getStamp();
            System.out.println(Thread.currentThread().getName() + " 第一次版本号: "+stamp);
            try { TimeUnit.SECONDS.sleep(3); } catch (InterruptedException e) { e.printStackTrace(); }
            System.out.println(Thread.currentThread().getName()+"\t"+"修改前为："+asr.getReference()+"\t是否修改成功："+asr.compareAndSet(100, 666, stamp, stamp + 1)+"\t修改后为："+asr.getReference()+"\t当前最新版本号: "+asr.getStamp());
        },"T4").start();
    }
}
