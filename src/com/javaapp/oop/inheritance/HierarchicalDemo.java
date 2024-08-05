package com.javaapp.oop.inheritance;
class Mobile{
    String brand;
    String model;
}
class Samsung extends Mobile{}
class Apple extends Mobile{}


public class HierarchicalDemo {
    public static void main(String[] args) {
        Samsung samsung=new Samsung();
        samsung.brand="Samsung";
        samsung.model="Galaxy s ultra 24";

        System.out.println(samsung.brand);
        System.out.println(samsung.model);

        Apple apple=new Apple();
        apple.brand="Apple";
        apple.model="iPhone 15 pro max";

        System.out.println(apple.brand);
        System.out.println(apple.model);
    }
}
