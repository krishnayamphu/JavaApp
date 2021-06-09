package javaapp.exceptionhandling;

public class TryCatchBlock {
    public static void main(String[] args) {
        int x=0, n=10;
        try {
            System.out.println("Output: " + (n / x));
        }catch (ArithmeticException e){
            System.err.println(e+", Number can't / zero.");
        }
    }
}
