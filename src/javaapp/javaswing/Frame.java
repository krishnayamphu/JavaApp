package javaapp.javaswing;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    JButton btn;
    public Frame(){
        btn =new JButton("Button");
        add(btn);
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Frame();
    }
}
