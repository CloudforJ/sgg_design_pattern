package com.atguigu.principle.singleresponsibility;

public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("The car");
        roadVehicle.run("The moto");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("The plane");

        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("The boat");
    }
}

class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " running on the road...");
    }
}

class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " flying in the air...");
    }
}

class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " swimming in the water...");
    }
}
