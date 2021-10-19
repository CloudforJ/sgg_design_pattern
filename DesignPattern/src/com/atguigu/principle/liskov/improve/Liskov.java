package com.atguigu.principle.liskov.improve;

public class Liskov {
    public static void main(String[] args) {
        B b = new B();
        int value = b.func2(3, 5);
        System.out.println(value);
    }
}

class Base {

}

class A extends Base{
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

class B extends Base {

    A a = new A();
    public int func1(int num1, int num2) {
        return num1 + num2;
    }

    public int func2(int num1, int num2) {
        return func1(num1, num2);
    }

    public int func3(int num1, int num2) {
        return a.func1(num1, num2);
    }
}