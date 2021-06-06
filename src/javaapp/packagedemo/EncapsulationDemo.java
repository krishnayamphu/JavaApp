package javaapp.packagedemo;

public class EncapsulationDemo {
    public static void main(String[] args) {
        Employee emp=new Employee();

//        emp.setName("Ramesh");
//        emp.setAddress("Kumaripati, Lalitpur, Nepal");

        System.out.println("Employee name: "+emp.getName());
        System.out.println("Employee address: "+emp.getAddress());
    }
}
