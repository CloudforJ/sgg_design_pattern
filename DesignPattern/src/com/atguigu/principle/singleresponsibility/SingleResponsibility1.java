package com.atguigu.principle.singleresponsibility;

public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("The car");
        vehicle.run("The moto");
        vehicle.run("The airplane");
    }
}

class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " running on the road...");
    }
}
