package com.javaapp.oop.inheritance;
class Address{
    String city,state,country;
    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
}
public class Employee {
    String name;
    double salary;
    Address address;
    public static void main(String[] args) {
        Employee e=new Employee();
        e.name="Ram";
        e.salary=1000;
        e.address=new Address("Lalitpur","Bagmati","Nepal");
        System.out.println(e.name);
        System.out.println(e.salary);
        System.out.println(e.address.city+", "+e.address.state+", "+e.address.country);
    }
}
