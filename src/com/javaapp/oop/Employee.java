package com.javaapp.oop;

public class Employee {
    String ename;
    double salary;
    static String cname="ABC Company";

    public static void getAddress(){
        System.out.println("Kumaripati, Lalitpur");
    }

    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.ename="ram";
        e1.salary=1000;


        Employee e2=new Employee();
        e2.ename="hari";
        e2.salary=1500;

        System.out.println(e1.ename);
        System.out.println(e1.salary);
        System.out.println(Employee.cname);
        Employee.getAddress();

        System.out.println(e2.ename);
        System.out.println(e2.salary);
        System.out.println(Employee.cname);
        Employee.getAddress();

    }
}
