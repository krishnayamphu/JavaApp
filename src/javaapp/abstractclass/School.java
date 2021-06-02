package javaapp.abstractclass;

public abstract class School {
    public School(){
        System.out.println("School is created.");
    }
    public abstract void schoolName();

    public void message(){
        System.out.println("I'm from abstract class.");
    }
}
