package com.javaapp.oop.inheritance;
class Shape{
    public void draw(){
        System.out.println("Drawing a shape");
    }
}
class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("Drawing a circle shape");
    }
}


public class MethodOverriding {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.draw();
    }
}
