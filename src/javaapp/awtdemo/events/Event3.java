package javaapp.awtdemo.events;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event3 extends Frame{
    Label lbltext;
    Button btn,btn2;
    public Event3(){
        lbltext=new Label();
        btn =new Button("Click");
        btn2=new Button("Button2");
        setVisible(true);
        setSize(400,300);
        setLayout(new FlowLayout());

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbltext.setText("hi");
            }
        });
        add(btn);

        add(lbltext);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        add(btn2);

    }

    public static void main(String[] args) {
        new Event3();
    }
}
