package com.javaapp.oop;

public class Bank {
    public Bank(){
        System.out.println("default constructor");
    }
    public Bank(String bankname){
        System.out.println("Bank name: "+bankname);
    }

    public static void main(String[] args) {
        Bank bank=new Bank("NMB Bank");

    }
}
