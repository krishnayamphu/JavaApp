package javaapp.inheritance;

public class Apple extends Mobile{
    double price;
    public void info(){
        brand="Apple";
        model="Iphone 5";
        price=500000;

        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Price: "+price);
    }
}
