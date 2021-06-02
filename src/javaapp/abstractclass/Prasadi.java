package javaapp.abstractclass;

public class Prasadi extends School {
    @Override
    public void schoolName() {
        System.out.println("Prasadi Higher Sec. School.");
    }
    public static void main(String[] args) {
        School prasadi=new Prasadi();
        prasadi.schoolName();
    }
}
