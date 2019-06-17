package com.daihui.exercises.exercise1.chapter1;

/**
 * @Description:
 * @Date: Created in 20:07 2019-06-17
 * @Author: daihui
 * @Modified By:
 */
public class SingletonDemo {

    // 加 volatile 禁止指令重排
    private static volatile SingletonDemo instance = null;

    public SingletonDemo(){
        System.out.println(Thread.currentThread().getName() + " 我是构造方法SingletonDemo()");
    }


    /**
     *  DCL单例模式（double check lock，双端检锁机制）
     */
    public static SingletonDemo getInstance(){

        if(instance == null){
            synchronized (SingletonDemo.class){
                if(instance == null){
                    instance = new SingletonDemo();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            new Thread(() -> {
                SingletonDemo.getInstance();
            },String.valueOf(i)).start();
        }
    }
}
