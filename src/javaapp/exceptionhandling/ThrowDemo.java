package javaapp.exceptionhandling;

public class ThrowDemo {
    public static void main(String[] args) {
        ThrowDemo throwDemo = new ThrowDemo();
        try {
            throwDemo.checkAge(12);
        } catch (ArithmeticException e) {
            System.err.println("You can't vote." + e);
        }
    }

    public void checkAge(int age) throws ArithmeticException {
        if (age >= 18) {
            System.out.println("You can vote !");
        } else {
            throw new ArithmeticException();
        }
    }
}
