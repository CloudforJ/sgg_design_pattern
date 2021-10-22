package com.atguigu.factory.factorymethod.pizzastore.order;

import com.atguigu.factory.factorymethod.pizzastore.pizza.Pizza;
import com.atguigu.factory.simplefactory.pizzastore.pizza.order.SimpleFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public abstract class OrderPizza {

    abstract Pizza createPizza(String orderType);
    public OrderPizza() {
        Pizza pizza = null;
        String orderType;       // which type of pizza to order
        do {
            orderType = getType();
            pizza = createPizza(orderType);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    private String getType() {
        try {
            InputStream in;
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Please input your pizza type");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
