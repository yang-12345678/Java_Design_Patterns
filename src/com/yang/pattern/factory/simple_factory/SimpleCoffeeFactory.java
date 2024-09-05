package com.yang.pattern.factory.simple_factory;

/**
 * 简单咖啡工厂，用来生产咖啡
 */
public class SimpleCoffeeFactory {
    public Coffee createCoffee(String type) {
        Coffee coffee = null;
        if("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("对不起，您点的咖啡没有了。");
        }

        return coffee;
    }
}
