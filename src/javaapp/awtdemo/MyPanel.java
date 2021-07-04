package javaapp.awtdemo;

import java.awt.*;

public class MyPanel extends Frame {
    public MyPanel(){
        setVisible(true);
        setSize(400,400);
        Button b1=new Button("Button 1");
        Button b2=new Button("Button 2");
        setLayout(new BorderLayout());

        Panel p1=new Panel();

        p1.add(b1);
        p1.add(new Button("button"));

        p1.setBackground(Color.blue);


        Panel p2=new Panel();

        p2.add(b2);
        p2.setBackground(Color.red);

        add(p1,BorderLayout.NORTH);
       add(p2,BorderLayout.CENTER);


    }
    public static void main(String[] args) {
       new MyPanel();
    }

}
