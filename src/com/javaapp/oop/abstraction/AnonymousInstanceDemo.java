package com.javaapp.oop.abstraction;
interface Writable{
    void write();
}
public class AnonymousInstanceDemo {
    public static void main(String[] args) {
        new Writable(){
            @Override
            public void write() {
                System.out.println("Writing some content");
            }
        }.write();
    }
}
