package com.atguigu.factory.simplefactory.pizzastore.pizza.order;

import com.atguigu.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.atguigu.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.atguigu.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.atguigu.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;

public class OrderPizza {
//    public OrderPizza() {
//        Pizza pizza = null;
//        String orderType;       // which type of pizza to order
//        do {
//            orderType = getType();
//            if (orderType.equals("greek")) {
//                pizza = new GreekPizza();
//            } else if (orderType.equals("cheese")) {
//                pizza = new CheesePizza();
//            } else if (orderType.equals("pepper")){
//                pizza = new PepperPizza();
//            } else {
//                break;
//            }
//            pizza.setName(orderType);
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        } while (true);
//    }

    public OrderPizza(SimpleFactory simpleFactory) {
        setFactory(simpleFactory);
    }

    SimpleFactory simpleFactory;
    Pizza pizza = null;
    public void setFactory(SimpleFactory simpleFactory) {
        String orderType = "";
        this.simpleFactory = simpleFactory;
        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);
            if (pizza != null) {
                pizza.setName(orderType);
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
                System.out.println("预定成功");
            } else {
                System.out.println("预定失败");
            }
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
