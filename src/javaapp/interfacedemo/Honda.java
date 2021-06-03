package javaapp.interfacedemo;

interface Bike{
    void run();
    default void msg(){
        System.out.println("Bike is created.");
    }
    static int getMaxSpeed(){
        return 300;
    }
}
public class Honda implements Bike{
    @Override
    public void run() {
        System.out.println("Honda bike running smoothly.");
    }

    public static void main(String[] args) {
        Bike bike=new Honda();
        bike.msg();
        int maxSpeed=Bike.getMaxSpeed();
        System.out.println("Maximum bike speed limit is: "+maxSpeed);
    }
}
