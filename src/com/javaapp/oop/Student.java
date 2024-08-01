package com.javaapp.oop;

public class Student {
    String name;
    int age;

    public static void main(String[] args) {
        Student s=new Student(); //object/instance
        s.name="Ram";
        s.age=20;
        System.out.println(s.name);
        System.out.println(s.age);

        Student s1=new Student();
        s1.name="Hari";
        s1.age=21;
        System.out.println(s1.name);
        System.out.println(s1.age);

    }
}
