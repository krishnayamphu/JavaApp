package com.javaapp.oop;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ConstructorInit {
    public static void main(String[] args) {
        Person p = new Person("Ram", 20);
        System.out.println(p.name);
        System.out.println(p.age);
    }
}
