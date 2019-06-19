package com.daihui.exercises.exercise1.chapter3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.concurrent.atomic.AtomicReference;

@Getter
@ToString
@AllArgsConstructor
class User{
    private String name;
    private int age;
}


/**
 * @Description:
 * @Date: Created in 11:33 2019-06-19
 * @Author: daihui
 *
 * 原子引用
 */
public class AtomicReferenceDemo {

    public static void main(String[] args) {
        AtomicReference<User> atomicReference = new AtomicReference<User>();

        User zhangSan = new User("zhang san",10);
        User liSi = new User("li si",20);

        atomicReference.set(zhangSan);

        System.out.println(atomicReference.compareAndSet(zhangSan, liSi) + "\tcurrent user: " + atomicReference.get());
        System.out.println(atomicReference.compareAndSet(zhangSan, liSi) + "\tcurrent user: " + atomicReference.get());
    }
}
