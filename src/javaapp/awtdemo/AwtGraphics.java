package javaapp.awtdemo;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class AwtGraphics extends Frame implements MouseListener {
    public AwtGraphics() {
        setVisible(true);
        setSize(500, 400);
        setTitle("Graphics");
        setLocationRelativeTo(null);
        addMouseListener(this);
    }

    public static void main(String[] args) {
        new AwtGraphics();
    }
    @Override
    public void paint(Graphics g){
        Color custom=new Color(0,255,0);
//        g.drawRect(10,50,100,100);
        g.drawOval(50,50,100,100);
        g.fillOval(200,50,100,100);

        g.setColor(custom);
        g.fillOval(350,50,100,100);

        g.setColor(Color.BLUE);
        g.drawLine(50,150,350,200);

        g.fillArc(100,100,100,100,45,180);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Graphics gc=getGraphics();
        gc.fillOval(e.getX(),e.getY(),50,50);
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
