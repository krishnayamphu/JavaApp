package javaapp.exceptionhandling;

public class ThrowsException {
    public static void main(String[] args) throws ArithmeticException{
        ThrowsDemo td=new ThrowsDemo();
        td.calculate(4,0);
    }
}
