package javaapp;

public class Math {
    public Math() {
        System.out.println("default math constructor.");

    }
    public Math(int n) {

        this();
        System.out.println("Lucky Number is:" + n);
    }


    public static void main(String[] args) {
        new Math(10);
    }
}
