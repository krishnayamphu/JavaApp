package javaapp.inheritance;

class A{
    private int a;
    public int x;
    public void testA(){
        System.out.println("Showing A Class");
    }
}
class B extends A{
    public int y;
    public void testB(){
        System.out.println("Showing B Class");
    }
}

public class C extends B {
    public int z;
    public static void main(String[] args) {
        C obj=new C();
        obj.x=4;
        obj.y=5;
        obj.z=6;


        obj.testA();
        obj.testB();


    }



}
