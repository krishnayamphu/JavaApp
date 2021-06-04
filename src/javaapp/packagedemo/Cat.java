package javaapp.packagedemo;

import javaapp.inheritance.Animal;

public class Cat extends Animal {
    public static void main(String[] args) {
       Cat animal=new Cat();

       animal.eat();
       animal.legs=5;
//       animal.color="red";
//       animal.info();
    }
}
