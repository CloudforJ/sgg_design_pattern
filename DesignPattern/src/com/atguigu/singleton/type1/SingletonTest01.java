package com.atguigu.singleton.type1;


public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1 == instance);
        System.out.println("Instance hashcode = " + instance.hashCode());
        System.out.println("Instance1 hashcode = " + instance1.hashCode());
    }
}


class Singleton {

    private Singleton() {

    }

    private final static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}