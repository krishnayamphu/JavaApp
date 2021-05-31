package javaapp;
public class Circle extends Shape {
    public void draw(){
        System.out.println("Drawing Circle.");
    }
 static void method(Shape a) {
        if(a instanceof Circle){
            Circle d=(Circle)a;//downcasting
            System.out.println("ok downcasting performed");
        }
    }
}
