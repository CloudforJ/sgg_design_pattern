package com.atguigu.factory.factorymethod.pizzastore.pizza;

public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {

        setName("伦敦胡椒披萨");
        System.out.println("准备伦敦的胡椒披萨原材料...");
    }
}
