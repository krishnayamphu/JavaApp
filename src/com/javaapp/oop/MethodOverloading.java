package com.javaapp.oop;

public class MethodOverloading {
    public void test(){
        System.out.println("Default test method");
    }
    public void test(String item){
        System.out.println("Testing "+item);
    }
    public void sum(int x, int y){
        System.out.println("Total sum (int): "+(x+y));
    }
    public void sum(double x, double y){
        System.out.println("Total sum (double): "+(x+y));
    }

    public static void main(String[] args) {
        MethodOverloading ob=new MethodOverloading();
        ob.test("mobile");
        ob.sum(5,4);
    }
}
