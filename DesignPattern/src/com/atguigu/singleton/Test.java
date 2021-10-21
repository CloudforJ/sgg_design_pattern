package com.atguigu.singleton;

public class Test {
    public static void main(String[] args) {

        // IDEA Ctrl+left click to look up Runtime source code
        // 饿汉式单例
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime);
    }
}
