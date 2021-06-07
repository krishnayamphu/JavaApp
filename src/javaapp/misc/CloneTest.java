package javaapp.misc;
class Person implements Cloneable{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

public class CloneTest {
    public static void main(String[] args) {
        try {
            Person p1=new Person("Ram",25);
            Person p2= null; //cloning object;
            p2 = (Person)p1.clone();
            System.out.println(p2.name);
            System.out.println(p2.age);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
