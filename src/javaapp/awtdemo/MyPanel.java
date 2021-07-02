package javaapp.awtdemo;

import java.awt.*;

public class MyPanel extends Frame {
    public MyPanel(){
        setVisible(true);
        setSize(400,400);
        setLayout(null);
        Button b1=new Button("Button 1");
        Button b2=new Button("Button 2");

        Panel p1=new Panel();
        p1.add(b1);
        p1.setBackground(Color.BLUE);
        p1.setSize(400,200);


        Panel p2=new Panel();
        p2.add(b2);


        add(p1);
        add(p2);


    }
    public static void main(String[] args) {
       new MyPanel();
    }

}
