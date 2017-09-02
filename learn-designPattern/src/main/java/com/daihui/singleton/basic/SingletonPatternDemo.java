package com.daihui.singleton.basic;

/**
 * 2.从singleton累获取唯一的对象
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2017/9/2.
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {

        // 不合法的构造函数
        // 编译时错误：构造函数SingleObject()是不可见的
        // SingleObject object = new SingleObject();

        // 获取唯一可用的对象
        SingleObject object = SingleObject.getInstance();

        // 显示消息
        object.showMessage();
    }
}
