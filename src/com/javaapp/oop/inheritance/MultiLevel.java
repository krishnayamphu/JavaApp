package com.javaapp.oop.inheritance;
class Vehicle{
    String type;
}
class Car extends Vehicle{
    String brand;
}
class Toyota extends Car{
    String model;
}
public class MultiLevel {
    public static void main(String[] args) {
        Toyota pradoCar=new Toyota();
        pradoCar.type="SUV Car";
        pradoCar.brand="Toyota";
        pradoCar.model="p123";

        System.out.println(pradoCar.type);
        System.out.println(pradoCar.brand);
        System.out.println(pradoCar.model);
    }
}
