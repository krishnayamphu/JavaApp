package javaapp.awtdemo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyDialog extends Frame {
    Button btn,btn1;
    Dialog dialog;
    public MyDialog(){
        dialog=new Dialog(this,true);
        dialog.setSize(300,200);

        btn=new Button("launch dialog box");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               dialog.setVisible(true);
            }
        });
        btn1=new Button("close");
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               dialog.setVisible(false);
            }
        });
        dialog.setLayout(new FlowLayout());
        dialog.add(btn1);

        setVisible(true);
        setLayout(new FlowLayout());
        setSize(400,300);
        setTitle("MyDailog");
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        add(btn);
    }
    public static void main(String[] args) {
        new MyDialog();
    }
}
