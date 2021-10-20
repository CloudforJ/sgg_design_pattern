package com.atguigu.singleton.type2;


public class SingletonTest02 {
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

    private static Singleton instance;

    static {
        instance = new Singleton();
    }

    public static Singleton getInstance() {
        return instance;
    }
}