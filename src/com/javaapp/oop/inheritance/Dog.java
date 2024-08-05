package com.javaapp.oop.inheritance;
class Animal{
    String name;
}
public class Dog extends Animal{
    int age;
    public void show() {
       name="Puppy";
       age=2;
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        new Dog().show();
    }
}
