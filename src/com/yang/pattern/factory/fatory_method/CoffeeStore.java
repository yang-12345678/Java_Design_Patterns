package com.yang.pattern.factory.fatory_method;

/**
 * 咖啡店
 */
public class CoffeeStore {

    private CoffeeFactory coffeeFactory;

    public void setFactory(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    // 点咖啡
    public Coffee orderCoffee() {

        Coffee coffee = coffeeFactory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;

    }
}
