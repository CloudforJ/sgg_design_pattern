package com.atguigu.principle.liskov;

public class Liskov {
    public static void main(String[] args) {
        B b = new B();
        int value = b.func2(3, 5);
        System.out.println(value);
    }
}

class A {
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

class B extends A {

    @Override
    public int func1(int num1, int num2) {
        return num1 + num2;
    }

    public int func2(int num1, int num2) {
        return func1(num1, num2);
    }
}