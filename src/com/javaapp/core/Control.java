package com.javaapp.core;

public class Control {
    public static void main(String[] args) {
        int a=5,b=6;
        if(a>b){
            System.out.println("a is greater");
        }else{
            System.out.println("b is greater");
        }

        double marks=80;
        if(marks>=90){
            System.out.println("Excellent");
        }else if(marks>=75){
            System.out.println("V Good");
        } else if (marks>=60) {
            System.out.println("Good");
        }else if(marks>=45){
            System.out.println("Satisfactory");
        }else{
            System.out.println("Poor");
        }

        int choice=2;
        switch (choice){
            case 1:
                System.out.println("show menu");
                break;
            case 2:
                System.out.println("show data");
                break;
            default:
                System.out.println("Invalid choice");
        }

    }
}
