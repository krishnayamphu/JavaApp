package javaapp.awtdemo;

import java.awt.*;

public class MyWindow extends Frame {
    MyWindow(String title){
        super(title);
        setVisible(true);
        setSize(600,400);
    }
    public static void main(String[] args) {
        new MyWindow("MyFrame Window");
    }
}
