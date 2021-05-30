package javaapp.inheritance;

final class ABC{
    final void message(){
        System.out.println("parent message method");
    }
}

public class FinalKeyowrd extends ABC{
    final int maxAge=120;  //final variable

    void message(){
        System.out.println("showing message");
    }

    public static void main(String[] args) {
        FinalKeyowrd obj=new FinalKeyowrd();

       // obj.maxAge=400;
    }
}
