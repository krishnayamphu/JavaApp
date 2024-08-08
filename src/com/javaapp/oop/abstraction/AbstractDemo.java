package com.javaapp.oop.abstraction;

abstract class Shape {

    String shapeName;
    public Shape(){
        System.out.println("Shape is created");
    }
    public void test() {
        System.out.println("testing abstract class");
    }

    abstract void draw();  //abstract method
}

class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing circle shape");
    }
}

class Rectangle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing rectangle shape");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
//            Shape shape=new Shape();
        Circle circle = new Circle();
        circle.draw();

        Rectangle rect = new Rectangle();
        rect.draw();
    }
}
