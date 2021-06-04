package javaapp.inheritance;

public class Animal { //default/no-modifier

    private String color;
    protected int legs;
    void info(){
        System.out.println("Animal created.");
    }
    public void eat(){
        System.out.println("eating");
    }
}
