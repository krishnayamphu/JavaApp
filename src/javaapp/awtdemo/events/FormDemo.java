package javaapp.awtdemo.events;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class FormDemo extends Frame implements ActionListener, MouseListener, MouseMotionListener {
    private Button btn,btnreset,btnext;
    private TextField textField;
    public FormDemo(){
        btn=new Button("Say Hello!");
        btnreset=new Button("Reset");
        btnext=new Button("Exit");
        textField=new TextField(20);

        setVisible(true);
        setSize(500,300);
        setTitle("FormDemo");
        setLayout(new FlowLayout());

        add(textField);
        textField.addMouseMotionListener(this);

        add(btn);
        btn.addActionListener(this);

        add(btnreset);
        btnreset.addActionListener(this);

        add(btnext);
        btnext.addActionListener(this);
        btnext.addMouseListener(this);

    }
    public static void main(String[] args) {
        new FormDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn){
            textField.setText("Hello World.");
            System.out.println("Hello World.");
        }
        if(e.getSource()==btnreset){
            textField.setText("");
            JOptionPane.showMessageDialog(this,"Reset successfully","Success",JOptionPane.WARNING_MESSAGE);

        }
        if(e.getSource()==btnext){
           System.exit(0);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if(e.getSource()==btnext){
            System.out.println("you pressed right click mouse button.");
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        if(e.getSource()==textField){
            int x=e.getX();
            int y=e.getY();
            textField.setText(String.valueOf(x)+","+String.valueOf(y));
        }
    }
}
