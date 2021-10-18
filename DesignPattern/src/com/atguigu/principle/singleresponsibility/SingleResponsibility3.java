package com.atguigu.principle.singleresponsibility;

public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("The bike");
        vehicle2.runAir("The plane");
        vehicle2.runWater("The boat");
    }
}

// 在类的级别上没有遵守单一职责原则，但是在方法级别上遵守了单一职责原则
class Vehicle2 {
    public void run(String vehicle) {
        System.out.println(vehicle + " running on the road...");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + " running in the air...");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + " running in the water...");
    }
}