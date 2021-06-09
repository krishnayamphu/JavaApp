package javaapp.exceptionhandling;

import javax.swing.*;

public class TryCatchBlock2 {
    public static void main(String[] args) {

        try{
            int age[]=new int[2];
            age[0]=10;
            age[1]=20;
            age[2]=30; //error
            //age[3]=40;
            System.out.println("hello");
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e);
            JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);
        }


    }
}
