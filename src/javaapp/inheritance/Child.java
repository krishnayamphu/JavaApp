package javaapp.inheritance;

class Parent{
    public String pname;

}

public class Child extends Parent {
    public String cname;
    public static void main(String[] args) {
        Child c=new Child();
        c.cname="Child name";
       c.pname="Parent Class";

        System.out.println(c.cname);
        System.out.println(c.pname);
    }
}
