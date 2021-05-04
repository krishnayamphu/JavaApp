package javaapp;

public class Student {
    String name;
    String address;
    int age;

    public Student(String name,String address,int age){
        this.name=name;
        this.address=address;
        this.age=age;
    }
    public Student getStudentObject(){
        return this;
    }
}
