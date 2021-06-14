package javaapp.awtdemo;

import java.awt.*;

public class MyForm extends Frame {
    private Label lblCourse,lblGender,lblCountry, lblDesc, lblTodo;
    private Checkbox cbBasic,cbJava;
    private Checkbox cbMale, cbFemale;
    private CheckboxGroup ckbGender;
    private Choice choiceCountry;
    private TextArea taDesc;
    private List mList;

    public MyForm(){
        lblCourse=new Label("Courses:");
        lblGender=new Label("Gender:");
        lblCountry=new Label("Country:");
        lblDesc=new Label("Description:");
        lblTodo=new Label("TodoList:");

        cbBasic=new Checkbox("Basic",true);
        cbJava=new Checkbox("Java");

        ckbGender=new CheckboxGroup();
        cbMale=new Checkbox("Male",ckbGender,false);
        cbFemale=new Checkbox("Female",ckbGender,false);



        choiceCountry=new Choice();
        choiceCountry.addItem("Select Country");
        choiceCountry.addItem("Nepal");
        choiceCountry.addItem("India");
        choiceCountry.addItem("China");

        taDesc=new TextArea(5,20);

        mList=new List();
        mList.add("buy milk");
        mList.add("go to hospital");
        mList.add("repairs bike");

        setVisible(true);
        setSize(300,400);
        setTitle("My Form");
        setLayout(new FlowLayout());

        add(lblCourse);
        add(cbBasic);
        add(cbJava);

        add(lblGender);
        add(cbMale);
        add(cbFemale);

        add(lblCountry);
        add(choiceCountry);

        add(lblDesc);
        add(taDesc);

        add(lblTodo);
        add(mList);

    }
    public static void main(String[] args) {
        new MyForm();
    }
}
