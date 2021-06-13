package javaapp.awtdemo;

import java.awt.*;

public class UserGUI extends Frame {
    private Label lbltext;
    private TextField txtHello;
    public UserGUI(){
        lbltext=new Label("Hello World");
        txtHello=new TextField();


        setVisible(true);
        setSize(300,200);
        setTitle("User Window");
        setLayout(null);

        lbltext.setBounds(20,50,100,80);
        add(lbltext);

        txtHello.setBounds(120,50,220,50);
        add(txtHello);
    }

    public static void main(String[] args) {
        new UserGUI();
    }

}
