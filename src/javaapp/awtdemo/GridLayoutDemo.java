package javaapp.awtdemo;

import java.awt.*;

public class GridLayoutDemo extends Frame {
    private Button[] btn;
    public GridLayoutDemo(){
        btn=new Button[9];
        for(int i=0; i<btn.length; i++){
            btn[i]=new Button("Button "+i);
            add(btn[i]);
        }
        setLayout(new GridLayout(3,3));
        setVisible(true);
        setSize(400,300);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
new GridLayoutDemo();
    }
}
