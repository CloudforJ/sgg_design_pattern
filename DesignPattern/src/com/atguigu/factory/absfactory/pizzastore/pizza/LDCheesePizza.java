package com.atguigu.factory.absfactory.pizzastore.pizza;

public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦胡椒披萨");
        System.out.println("准备伦敦奶酪披萨原材料...");
    }
}
