package javaapp.exceptionhandling;

public class ThrowsDemo {
    public void calculate(int x,int y) throws ArithmeticException{
        System.out.println("Result: "+(x/y));
    }
    public static void main(String[] args) {
    ThrowsDemo td=new ThrowsDemo();
    try{
        td.calculate(4,0);
    }catch (ArithmeticException e){
        System.err.println(e+" ...");
    }
    }
}
