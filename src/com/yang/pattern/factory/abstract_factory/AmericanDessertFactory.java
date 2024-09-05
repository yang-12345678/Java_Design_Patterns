package com.yang.pattern.factory.abstract_factory;

/**
 * 美式风味甜品工厂
 */
public class AmericanDessertFactory implements DessertFactory{

    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    public Dessert createDessert() {
        return new MatchMousse();
    }
}
