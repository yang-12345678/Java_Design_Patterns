package com.yang.pattern.factory.abstract_factory;

public class Client {
    public static void main(String[] args) {
        // 创建的是意大利风味甜品工厂
        DessertFactory factory = new ItalyDessertFactory();

        // 获取拿铁咖啡和提拉米夫甜品
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();
        System.out.println(coffee.getName());
        dessert.show();
    }
}
