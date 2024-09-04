package com.yang.pattern.singleton.demo3;

/**
 * 懒汉式
 */
public class Singleton {
    // 私有构造方法
    private Singleton() {
    }

    // 声明 Singleton 类型的变量 instance
    private static Singleton instance;  // 只是声明一个该类型的变量

    // 对外提供访问方式
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
