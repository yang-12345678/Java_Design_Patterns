package com.yang.pattern.factory.abstract_factory;

/**
 * 意大利风味甜品工厂
 */
public class ItalyDessertFactory implements DessertFactory{

    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    public Dessert createDessert() {
        return new Trimisu();
    }
}
