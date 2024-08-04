package com.javaapp.oop;

public class ThisDemo {
    private int x;
    private int y;

    public ThisDemo(){
        System.out.println("ThisDemo instance created.");
    }
    public ThisDemo(String s){
        this();
        System.out.println("Testing: "+s);
    }

    public void setValue(int x, int y){
        this.x=x;
        this.y=y;
    }

    public String hello(){
        return "Hello";
    }
    public void show(){
        System.out.println("Greeting Message: "+this.hello());
    }

    public static void main(String[] args) {
        ThisDemo ob=new ThisDemo("Car");
        ob.setValue(10,5);

        System.out.println(ob.x);
        System.out.println(ob.y);

        ob.show();
    }
}
