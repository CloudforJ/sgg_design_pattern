package com.atguigu.singleton.type8;

public class SingtonTest08 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
        instance.sayOK();
        instance1.sayOK();
    }
}

enum Singleton {
    INSTANCE;
    public void sayOK() {
        System.out.println("OK~");
    }
}