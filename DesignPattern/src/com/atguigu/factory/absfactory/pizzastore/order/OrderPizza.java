package com.atguigu.factory.absfactory.pizzastore.order;

import com.atguigu.factory.absfactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class OrderPizza {

    public OrderPizza(AbsFactory factory) {
        setFactory(factory);
    }

    AbsFactory factory;

    private void setFactory(AbsFactory factory) {
        Pizza pizza = null;
        String orderType = "";
        this.factory = factory;
        do {
            orderType = getType();
            pizza = factory.createPizza(orderType);
            if (pizza != null) {
                System.out.println("订购成功");
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败");
            }
        } while (true);
    }

    public String getType() {
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
