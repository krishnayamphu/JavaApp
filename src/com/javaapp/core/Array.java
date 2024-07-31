package com.javaapp.core;

public class Array {
    public static void main(String[] args) {
        int[] num=new int[3];
        num[0]=100;
        num[1]=200;
        num[2]=300;

        System.out.println(num[0]);
        System.out.println("-----------------");
        for(int i=0; i<3; i++){
            System.out.println(num[i]);
        }

        int age[]={20,21,22};
        for (int i=0; i<3; i++){
            System.out.println("Age: "+age[i]);
        }

        double temp[]={21.23,23.12,24.5};
        for(double t:temp){
            System.out.println(t);
        }
        System.out.println("-----------2D----------");
        int A[][]=new int[2][2];
        A[0][0]=10;
        A[0][1]=20;
        A[1][0]=30;
        A[1][1]=40;

        System.out.println(A[0][0]);
        System.out.println("-----------");
        for(int i=0; i<2; i++){
            for(int j=0; j<2;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println("");
        }

    }
}
