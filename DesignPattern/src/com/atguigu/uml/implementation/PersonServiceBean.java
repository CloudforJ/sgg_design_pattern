package com.atguigu.uml.implementation;

public class PersonServiceBean implements PersonServic {
    @Override
    public void delete(Integer id) {
        System.out.println("Delete...");
    }
}
