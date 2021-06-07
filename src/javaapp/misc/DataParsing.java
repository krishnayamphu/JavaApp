package javaapp.misc;

public class DataParsing {
    public static void main(String[] args) {
        String num="10";

        int i=Integer.parseInt(num);
        double d=Double.parseDouble(num);

        String s=String.valueOf(d);

        System.out.println(i);
        System.out.println(d);
        System.out.println("String:"+s);
    }
}
