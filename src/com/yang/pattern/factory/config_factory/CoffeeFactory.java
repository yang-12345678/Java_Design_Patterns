package com.yang.pattern.factory.config_factory;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

public class CoffeeFactory {

    // 加载配置文件，获取配置文件中配置的全类名，并创建该类的对象进行存储
    // 1. 定义容器对象存储咖啡对象
    private static HashMap<String, Coffee> map = new HashMap<>();

    // 2. 加载配置文件，只需要加载一次
    static {
        // 2.1 创建 Properties 对象
        Properties p = new Properties();
        // 2.2 加载配置文件
        InputStream is = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            p.load(is);
            // 从p集合中获取全类名并创建对象
            Set<Object> keys = p.keySet();
            for (Object key : keys) {
                String className = p.getProperty((String) key);
                // 通过反射创建对象
                Class clazz = Class.forName(className);
                Coffee coffee = (Coffee) clazz.newInstance();
                // 将名称和对象存储到容器
                map.put((String) key, coffee);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    // 根据名称获取对象
    public static Coffee createCoffee(String name) {
        return map.get(name);
    }
}
