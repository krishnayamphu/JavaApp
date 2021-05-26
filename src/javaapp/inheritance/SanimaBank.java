package javaapp.inheritance;

public class SanimaBank extends Bank {
    public String branch;

    public SanimaBank(){
        super("Sanima");
        System.out.println("Sanima Bank is created.");
    }

    public void info(){
        super.name="Sanima Bank";
        super.address="Naxal, Kathmandu";
        this.branch="Naxal";
        System.out.println("Bank Name: "+super.name);
        System.out.println("Bank Address: "+super.address);
        System.out.println("Branch: "+this.branch);

    }

    public static void main(String[] args) {
        SanimaBank sanimaBank =new SanimaBank();

        sanimaBank.info();

    }
}
