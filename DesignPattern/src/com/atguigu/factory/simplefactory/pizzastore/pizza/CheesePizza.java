package com.atguigu.factory.simplefactory.pizzastore.pizza;

public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("制作奶酪披萨准备原材料...");
    }
}
