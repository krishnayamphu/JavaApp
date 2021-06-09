package javaapp.exceptionhandling;

public class MultiCatchBlock {
    public static void main(String[] args) {
        try {
            int age[] = {10, 20};
            double output = 40 / 0;
            System.out.println("Age: " + age[0]);
            System.out.println("Output: " + output);
        } catch (ArrayIndexOutOfBoundsException|ArithmeticException e) {
            System.err.println(e);
        }

        /*
        catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Array index is out of range");
        }catch (ArithmeticException e){
            System.err.println("Number can't / by zero.");
        }
        */

    }
}
