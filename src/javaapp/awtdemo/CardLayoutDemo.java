package javaapp.awtdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutDemo extends Frame implements ActionListener {
    private Button btnRed, btnGreen;
    private Panel pTop, pMain, pRed, pGreen;

    public CardLayoutDemo() {
        btnRed = new Button("Red");
        btnRed.addActionListener(this);
        btnGreen = new Button("Green");
        btnGreen.addActionListener(this);

        pTop = new Panel();
        pTop.setLayout(new FlowLayout());
        pTop.setBackground(Color.GRAY);
        pTop.add(btnRed);
        pTop.add(btnGreen);

        pRed = new Panel();
        pRed.setBackground(Color.RED);
        pGreen = new Panel();
        pGreen.setBackground(Color.GREEN);


        pMain = new Panel();
        pMain.setLayout(new CardLayout());
        pMain.add(pRed);
        pMain.add(pGreen);





        setVisible(true);
        setSize(400, 400);
        setLayout(new BorderLayout());

        add(pTop, BorderLayout.NORTH);
        add(pMain, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new CardLayoutDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnRed){
            pRed.setVisible(true);
            pGreen.setVisible(false);
        }
        if(e.getSource()==btnGreen){
            pRed.setVisible(false);
            pGreen.setVisible(true);
        }
    }
}
