package com.javaapp.oop.inheritance;
//final class Math{
class Math{
    public final void sum(int x, int y){
        System.out.println("sum: "+(x+y));
    }
}
public class FinalDemo extends Math{
    final int x=5;
//    @Override
//    public void sum(int x, int y){
//        System.out.println("Total output: "+(x+y));
//    }

    public static void main(String[] args) {
        FinalDemo ob=new FinalDemo();
        //ob.x=15; //modified
        System.out.println(ob.x);
        ob.sum(15,4);
    }
}
