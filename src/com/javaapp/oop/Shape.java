package com.javaapp.oop;

public class Shape {
    private int w, h;

    public void getShape(Shape s) {
        System.out.println("Shape size is: " + s.w + "., " + s.h);
    }

    public void show() {
        this.w = 100;
        this.h = 200;
        getShape(this);
    }

    public Shape getCurrentShape() {
        return this;
    }

    public static void main(String[] args) {
        new Shape().show();

      Shape s=new Shape().getCurrentShape();
      s.show();

        System.out.println("width:"+s.w);
    }


}
