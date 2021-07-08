package javaapp.awtdemo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PopUpMenu extends Frame implements MouseListener {
    PopupMenu pm;
    MenuItem miAbout,miRefresh,miExit;
    public PopUpMenu(){
        pm=new PopupMenu("Main");
        miAbout=new MenuItem("About");
        miRefresh=new MenuItem("Refresh");
        miExit=new MenuItem("Exit");
        miExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        pm.add(miAbout);
        pm.add(miRefresh);
        pm.add(miExit);

        add(pm);
        setVisible(true);
        setSize(400,200);
        setLayout(null);
        addMouseListener(this);
    }

    public static void main(String[] args) {
        new PopUpMenu();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        pm.show(this,e.getX(),e.getY());
//        System.out.println("mouse clicked");
    }
    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
