package javaapp.inheritance;

public class Employee {
    String name;
    Address address;
    public void getEmployeeInfo(String name, Address address) {
        System.out.println("Name:" + name);
        System.out.println("Address:" + address.city + ", " + address.state + ", " + address.country);
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        Address a1 = new Address("Ktm", "Bagmati", "Nepal");
        Address a2 = new Address("Lalitpur", "Bagmati", "Nepal");
        emp1.getEmployeeInfo("Ram", a1);
        emp2.getEmployeeInfo("sita", a2);
    }
}
