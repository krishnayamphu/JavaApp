package com.javaapp.oop.inheritance;
class Bike{
    public void run(){
        System.out.println("running bike");
    }
}

class Splendar extends Bike {
    @Override
    public void run(){
        System.out.println("Splendar bike running smoothly");
    }
}
class Pulsar extends Bike{
    @Override
    public void run(){
        System.out.println("Pulsar bike running safely");
    }
}
public class Polymorphism {
    public static void main(String[] args) {

        Bike splendar=new Splendar();
        Bike pulsar=new Pulsar();

        splendar.run();
        pulsar.run();
    }
}
