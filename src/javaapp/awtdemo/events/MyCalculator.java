package javaapp.awtdemo.events;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCalculator extends Frame implements ActionListener {
    private double n1, n2;
    private char op;
    private Label ln1, ln2, lresult;
    private TextField txtn1, txtn2, txtresult;
    private Button btnpls, btnmin, btnclr, btnext;

    public MyCalculator() {

        ln1 = new Label("N1: ");
        ln2 = new Label("N2: ");
        lresult = new Label("Result: ");

        txtn1 = new TextField(20);
        txtn2 = new TextField(20);
        txtresult = new TextField(20);

        btnpls = new Button(" + ");
        btnmin = new Button(" - ");
        btnclr = new Button(" C ");
        btnext = new Button("Exit");

        setVisible(true);
        setSize(200, 300);
        setTitle("Basic Calculator");
        setLayout(new FlowLayout());

        add(ln1);
        add(txtn1);

        add(ln2);
        add(txtn2);

        add(lresult);
        add(txtresult);

        add(btnpls);
        btnpls.addActionListener(this);

        add(btnmin);
        btnmin.addActionListener(this);

        add(btnclr);
        btnclr.addActionListener(this);

        add(btnext);
        btnext.addActionListener(this);
    }

    public static void main(String[] args) {
        new MyCalculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnpls) {
            n1 = Double.parseDouble(txtn1.getText());
            n2 = Double.parseDouble(txtn2.getText());
            txtresult.setText(String.valueOf(n1 + n2));
        }
        if (e.getSource() == btnmin) {
            n1 = Double.parseDouble(txtn1.getText());
            n2 = Double.parseDouble(txtn2.getText());
            txtresult.setText(String.valueOf(n1 - n2));
        }
        if (e.getSource() == btnclr) {
            txtn1.setText("");
            txtn2.setText("");
            txtresult.setText("");
        }
    }
}
