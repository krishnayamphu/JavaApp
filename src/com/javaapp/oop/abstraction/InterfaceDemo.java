package com.javaapp.oop.abstraction;
class Splendar implements Bike,Wheels{

    @Override
    public void run() {
        System.out.println("Splendar bike is running smoothly.");
    }

    @Override
    public void wheelsSize() {
        System.out.println("Wheels size: 100x10 both");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Splendar bike=new Splendar();
        bike.wheelsSize();
        bike.run();
    }
}
