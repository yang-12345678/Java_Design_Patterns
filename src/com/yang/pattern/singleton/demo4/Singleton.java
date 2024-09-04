package com.yang.pattern.singleton.demo4;

/**
 * 双重检查锁
 */
public class Singleton {

    // 私有构造器方法
    private Singleton() {}

    // 声明 Singleton 类型的变量
    private static volatile Singleton instance;

    // 对外提供公共的访问方式
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}
