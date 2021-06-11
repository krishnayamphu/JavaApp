package javaapp.misc;

public class ObjectClassDemo {
    public static void main(String[] args) {
        Alien alien=new Alien("Alien123","Green");

        System.out.println(alien.toString());

        Object object=new Alien("Aliean100","Red");
        System.out.println(object.toString());
    }
}
