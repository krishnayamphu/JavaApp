package com.javaapp.oop.inheritance;
class Fruit{
    public void test(){
        System.out.println("Testing fruit");
    }
}
class Mango{
    public void getFlavour(){
        System.out.println("sweet");
    }
}
public class InstanceofDemo {
    public static void main(String[] args) {
        Fruit f=new Fruit();
        Mango m=new Mango();
        System.out.println(f instanceof Fruit);
//        System.out.println(f instanceof Mango);
    }
}
