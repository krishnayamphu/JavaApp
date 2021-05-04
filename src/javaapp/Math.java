package javaapp;

public class Math {
    public Math() {
        System.out.println("default math constructor.");
    }
    public Math(int n) {
        this();//new Math()
        System.out.println("Lucky Number is:" + n);
    }
    public Math(int x, int y){
       this(x+y);
        System.out.println("X:"+x+", y:"+y);
    }
    public static void main(String[] args) {
       new Math(5,10);

    }
}
