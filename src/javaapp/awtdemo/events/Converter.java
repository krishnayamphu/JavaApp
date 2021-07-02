package javaapp.awtdemo.events;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Converter extends Frame implements ActionListener{
    double n1;
    private Label lblselector,lblkm,lblm;
    private Button btnkm,btnm,btnclear,btnconvert;
    private TextField txtkm,txtm;
    public Converter(){
        lblselector=new Label("Select the conversion you want to do:");
        btnkm=new Button("Meter to KM");
        btnm= new Button("KM to Meter");


        setVisible(true);
        setSize(300,300);
        setTitle("Converter");
        setLayout(new FlowLayout());

        add(lblselector);
        add(btnkm);
        btnkm.addActionListener(this);
        add(btnm);
        btnm.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new Converter();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        lblm=new Label("Value in M:");
        lblkm=new Label("Value in KM:");
        txtkm=new TextField(20);
        txtm= new TextField(20);
        btnconvert= new Button("Convert");

        setVisible(true);
        setLayout(new FlowLayout());
        if(e.getSource()==btnkm){

            add(lblkm);
            add(txtkm);
            add(btnconvert);
            btnconvert.addActionListener(this);
            if(e.getSource()==btnconvert){
                add(lblm);
                add(txtm);
                n1= Double.parseDouble(txtkm.getText());
                txtm.setText(String.valueOf(n1/1000));
            }

        }
    }
}