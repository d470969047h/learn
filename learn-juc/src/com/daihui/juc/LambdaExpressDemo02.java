package com.daihui.juc;


/**
 * 函数式接口注解，只允许有一个抽象方法
 */
@FunctionalInterface
interface Foo{

    int add(int x, int y);

    default int mul(int x, int y){
        return x + y;
    }

    default int div(int x, int y){
        return x / y;
    }

    static int sub1(int x, int y){
        return x - y;
    }

    static int sub2(int y, int x){
        return y - x;
    }
}

/**
 * @Description:
 * @Date: Created in 3:53 下午 2019/10/26
 * @Author: daihui
 * @Modified By:
 */
public class LambdaExpressDemo02 {

    public static void main(String[] args) {
//        Foo foo = (int x, int y)-> x + y;
        Foo foo = Integer::sum;
        System.out.println(foo.add(1, 2));
        System.out.println(foo.mul(2, 3));
        System.out.println(foo.div(4, 5));
        System.out.println(Foo.sub1(2, 1));
        System.out.println(Foo.sub2(5, 2));
    }
}
