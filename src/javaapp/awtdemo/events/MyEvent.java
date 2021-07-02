package javaapp.awtdemo.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyEvent implements ActionListener {
    private Event2 event2;
    public MyEvent(Event2 event2){
        this.event2=event2;
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println("it's working.");
       event2.lbltext.setText("Hello world.");
    }
}
