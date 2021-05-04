package javaapp;

public class StaticKeyword {
    int x; //non-static member
    static int n; //static member


    public static void main(String[] args) {
        System.out.println(Person.maxAge);
        test();
    }

    static void test() {
        System.out.println("testing something.");

    }
    static {
        System.out.println("static block");
    }
}
