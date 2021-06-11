package javaapp.exceptionhandling;

public class FinallyBlockDemo {
    public static void main(String[] args) {
        try{
            int num[]={10,20,30};
            System.out.println(num[10]);
            System.out.println("I'm Java Programmer.");
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e);
        }finally {
            System.out.println("Hello World !.");
            System.out.println("finally you reached finally block.");
        }
    }
}
