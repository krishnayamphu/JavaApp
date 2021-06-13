package javaapp.awtdemo;
import java.awt.Frame;
public class FrameDemo {
    public static void main(String[] args) {
        Frame f=new Frame();
        f.setVisible(true);
        f.setSize(800,400);
        f.setTitle("My FrameDemo Window");
        f.setResizable(false);
    }
}
