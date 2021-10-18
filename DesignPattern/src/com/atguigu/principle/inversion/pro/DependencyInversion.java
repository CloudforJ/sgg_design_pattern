package com.atguigu.principle.inversion.pro;


public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new Wechat());
    }
}

interface IReceiver {
    String getInfo();
}

class Email implements IReceiver {
    @Override
    public String getInfo() {
        return "The message of the email: Hello World!";
    }
}

class Wechat implements IReceiver {
    @Override
    public String getInfo() {
        return "The message of Wechat: Hello Pony!";
    }
}

class Person {
    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}