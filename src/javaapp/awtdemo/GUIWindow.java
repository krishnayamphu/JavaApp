package javaapp.awtdemo;

import java.awt.*;

public class GUIWindow {
    public static void main(String[] args) {
        Frame f=new Frame();
        FlowLayout fl=new FlowLayout();

        Label lblUser=new Label("Username: ");
        Label lblPass=new Label("Password: ");

        TextField txtUser=new TextField(20);
        TextField txtPass=new TextField(20);

        Button btnLogin=new Button("Login");

        f.setVisible(true);
        f.setSize(300,200);
        f.setTitle("User Login");
        f.setLayout(fl);

        //adding components:
        f.add(lblUser);
        f.add(txtUser);

        f.add(lblPass);
        f.add(txtPass);

        f.add(btnLogin);
    }
}
