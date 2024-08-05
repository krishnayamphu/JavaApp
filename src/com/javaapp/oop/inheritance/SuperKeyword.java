package com.javaapp.oop.inheritance;
class School{
    String sclName;
    String sclAddress;

    public School(String sclName, String sclAddress) {
        this.sclName = sclName;
        this.sclAddress = sclAddress;
    }
    public String sclAddress(){
        return this.sclAddress;
    }
}

class Student extends School{
    String stdName;

    public Student(String sclName, String sclAddress, String stdName) {
        super(sclName, sclAddress);
        this.stdName = stdName;
    }
    public void stdInfo(){
        System.out.println("Student name: "+this.stdName);
        System.out.println("School name: "+super.sclName);
        System.out.println("School address: "+super.sclAddress());
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        Student s=new Student("United School","Kumaripati, Lalitpur","Ram");
        s.stdInfo();
    }
}
