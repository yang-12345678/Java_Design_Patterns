package com.yang.pattern.singleton.demo7;

import java.io.Serializable;

/**
 * 静态内部类方式
 */
public class Singleton implements Serializable {
    // 私有构造方法
    private Singleton() {}

    // 定义一个静态内部类
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
