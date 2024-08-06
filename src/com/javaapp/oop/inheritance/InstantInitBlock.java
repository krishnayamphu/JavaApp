package com.javaapp.oop.inheritance;

public class InstantInitBlock {
    public int maxspeed;

    //instant int block
    {
        maxspeed=150;
    }

    public static void main(String[] args) {
        InstantInitBlock ins=new InstantInitBlock();
        System.out.println(ins.maxspeed);
    }
}
