package javaapp.awtdemo;

import java.awt.*;

public class MenubarDemo extends Frame {
    private MenuBar mb;
    private Menu mFile, mHelp;
    private MenuItem miAbout;
    public MenubarDemo(){
        mb=new MenuBar();
        mFile=new Menu("File");
        mHelp=new Menu("Help");

        miAbout=new MenuItem("About");

        setMenuBar(mb);
        mb.add(mFile);
        mb.add(mHelp);
        mHelp.add(miAbout);

        setVisible(true);
        setSize(500,400);
    }

    public static void main(String[] args) {
        new MenubarDemo();
    }
}
