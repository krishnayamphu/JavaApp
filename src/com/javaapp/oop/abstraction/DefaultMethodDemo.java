package com.javaapp.oop.abstraction;
interface Printable{
    void print();
    default void test(){
        System.out.println("Test Print");
    }
}
class Canon implements Printable{

    @Override
    public void print() {
        System.out.println("Printing some documents");
    }
}
public class DefaultMethodDemo {
    public static void main(String[] args) {
        Canon c=new Canon();
        c.test();
    }
}
