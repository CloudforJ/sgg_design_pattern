package com.atguigu.principle.inversion;


public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email {
    public String getInfo() {
        return "The message of the email: Hello World!";
    }
}

class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}