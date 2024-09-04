package com.yang.pattern.singleton.demo7;

import java.io.*;

/**
 * 序列化反序列化破坏单例模式
 */
public class Client {
    public static void main(String[] args) throws Exception {
        // writeObject2File();
        readObject();
        readObject();
    }

    // 从文件读取数据（对象）
    public static void readObject() throws Exception {
        // 1. 创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/com/yang/pattern/singleton/demo7/a.txt"));
        // 2. 读取对象
        Singleton instance = (Singleton) ois.readObject();
        System.out.println(instance);
        // 释放资源
        ois.close();
    }

    // 向文件中写数据（对象）
    public static void writeObject2File() throws Exception {
        // 1. 获取 Singleton 对象
        Singleton instance = Singleton.getInstance();
        // 2. 创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/com/yang/pattern/singleton/demo7/a.txt"));
        // 3. 写对象
        oos.writeObject(instance);
        oos.close();
    }
}
