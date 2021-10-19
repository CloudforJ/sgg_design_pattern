package com.atguigu.principle.ocp.improve;

public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new Other());
    }
}

class GraphicEditor {
    public void drawShape(Shape s) {
        s.draw();
    }
}

abstract class Shape {
    int my_type;
    public abstract void draw();
}

class Rectangle extends Shape {
    Rectangle() {
        super.my_type = 1;
    }
    @Override
    public void draw() {
        System.out.println("画矩形");
    }
}

class Circle extends Shape {
    Circle() {
        super.my_type = 2;
    }
    @Override
    public void draw() {
        System.out.println("画圆形");
    }
}

class Triangle extends Shape {
    Triangle() {
        super.my_type = 3;
    }
    @Override
    public void draw() {
        System.out.println("画三角形");
    }
}

class Other extends Shape {
    Other() {
        super.my_type = 4;
    }

    @Override
    public void draw() {
        System.out.println("画其他图形");
    }
}