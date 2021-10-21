package com.atguigu.singleton.type6;

public class SingletonTest06 {
    public static void main(String[] args) {
        System.out.println("双重检查");
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1 == instance);
        System.out.println(instance1.hashCode());
        System.out.println(instance.hashCode());
    }
}

class Singleton {
    private static volatile Singleton instance;
    private Singleton() {

    }
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}