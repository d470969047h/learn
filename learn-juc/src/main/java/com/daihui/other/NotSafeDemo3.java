package com.daihui.other;


import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 1. 故障现象
 * java.util.ConcurrentModificationException
 * 2. 导致原因
 *
 * 3. 解决方案
 *  3.1 new Vector<>();
 *  3.2 Collections.synchronizedList(new ArrayList<>());
 *  3.2 new CopyOnWriteArrayList<>();
 *
 * 4. 优化建议（不犯第二次错）
 *
 */
public class NotSafeDemo3 {

    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();//Collections.synchronizedList(new ArrayList<>());//new Vector<>();//new ArrayList();

        for(int i = 1; i <= 10; i++){
            new Thread(() -> {
                list.add(UUID.randomUUID().toString().substring(0,8));
                System.out.println(list);
            },String.valueOf(i)).start();
        }

    }
}
