package javaapp.awtdemo.events;

import java.awt.*;

public class Event2 extends Frame  {
    Label lbltext;
    Button btn;
    public Event2(){
        lbltext=new Label();
        btn =new Button("Click");
        setVisible(true);
        setSize(400,300);
        setLayout(new FlowLayout());

        btn.addActionListener(new MyEvent(this));
        add(btn);

        add(lbltext);
    }

    public static void main(String[] args) {
        new Event2();
    }

}
