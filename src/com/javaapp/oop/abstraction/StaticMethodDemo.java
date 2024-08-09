package com.javaapp.oop.abstraction;
interface Playable{
    static void playTestSound() {
        System.out.println("Playing test sound");
    }
}
public class StaticMethodDemo {
    public static void main(String[] args) {
        Playable.playTestSound();
    }

}
