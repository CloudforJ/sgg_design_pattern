package com.atguigu.principle.ocp;

import java.awt.*;
import java.util.TreeMap;

public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }
}

class GraphicEditor {
    public void drawShape(Shape s) {
        if (s.my_type == 1) {
            drawRectangle(s);
        } else if (s.my_type == 2){
            drawCircle(s);
        } else if (s.my_type == 3) {
            drawTriangle(s);
        }
    }

    public void drawRectangle(Shape s) {
        System.out.println("画矩形");
    }

    public void drawCircle(Shape s) {
        System.out.println("画圆形");
    }

    public void drawTriangle(Shape s) {
        System.out.println("画三角形");
    }
}

class Shape {
    int my_type;
}

class Rectangle extends Shape {
    Rectangle() {
        super.my_type = 1;
    }
}

class Circle extends Shape {
    Circle() {
        super.my_type = 2;
    }
}

class Triangle extends Shape {
    Triangle() {
        super.my_type = 3;
    }
}