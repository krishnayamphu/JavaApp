package javaapp.interfacedemo;

public class InterfaceDemoClass implements Drawable,Printable {

    public static void main(String[] args) {
    InterfaceDemoClass demo=new InterfaceDemoClass();
    demo.draw();
    demo.print();
    }

    @Override
    public void draw() {
        System.out.println("drawing picture.");
    }

    @Override
    public void print() {
        System.out.println("printing something");
    }
}
