package javaapp.inheritance;

import java.awt.*;

public class MyFrame extends Frame {
    public MyFrame(String title){
        super(title);
        setVisible(true);
        setSize(500,400);
    }

    public static void main(String[] args) {
        new MyFrame("MyFrame Demo");
    }
}
