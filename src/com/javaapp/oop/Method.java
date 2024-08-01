package com.javaapp.oop;

public class Method {
    public void hello(){
        System.out.println("hello World");
    }
    public int getMaxSpeed(){
        return 150;
    }

    public void info(String name,String address){
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
    }

    public void sum(int x, int y){
        System.out.println("Total sum: "+(x+y));
    }

    public double getDiscount(double price,double dis_per){
        return  (price*dis_per)/100;
    }
    public static void main(String[] args) {
        Method obj=new Method();
        obj.hello();

        //new Method().hello();

        System.out.println("Max bike speed limit is: "+obj.getMaxSpeed());

        obj.sum(10,5);
        obj.sum(40,50);

        obj.info("Ram","ktm");

        System.out.println("Discount price: "+obj.getDiscount(100,10));
    }
}
