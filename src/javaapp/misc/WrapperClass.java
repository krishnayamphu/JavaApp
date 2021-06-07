package javaapp.misc;

public class WrapperClass {
    public static void main(String[] args) {
        int a=5;

        Integer i=a; //Integer.valueOf(a); //autoboxing

        System.out.println(i);


        Integer integer=new Integer(10);
        int x=integer.intValue(); //int value//unboxing
    }
}
