package javaapp;

public class Student {
    String name;
    String address;
    int age;

    public Student(){
        System.out.println("javaapp.Student instance is created.");
    }

    public Student(String name){
        System.out.println("javaapp.Student name is :"+name);
    }
    public static void main(String[] args) {
        new Student("ram");
//        s.getStudentInfo();

    }

    private void getStudentInfo(){
        System.out.println("showing student info");
    }
}
