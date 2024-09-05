package com.yang.pattern.factory.config_factory;


public class Client {
    public static void main(String[] args) {
        Coffee american = CoffeeFactory.createCoffee("latte");
        System.out.println(american.getName());
    }
}
