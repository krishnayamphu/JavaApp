package javaapp.inheritance;
class A1{
    A1 get(){
        return this;
    }
}
class B1 extends A1{
    @Override
    B1 get(){
        return this;
    }
    public void message(){
        System.out.println("covariant return type demo.");
    }
}
public class CovariantDemo {
    public static void main(String[] args) {
        new B1().get().message();
    }
}
