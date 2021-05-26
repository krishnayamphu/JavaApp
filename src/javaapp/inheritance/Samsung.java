package javaapp.inheritance;

public class Samsung extends Mobile{
    boolean wifi;
    public void info(){
        brand="Samsung";
        model="Galaxy s5";
        wifi=true;

        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        if(wifi){
            System.out.println("Wifi:enabled");
        }else {
            System.out.println("Wifi: disabled");
        }
    }
}
