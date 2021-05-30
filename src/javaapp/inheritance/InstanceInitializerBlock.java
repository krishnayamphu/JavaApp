package javaapp.inheritance;
class ParentBlock{
    public ParentBlock(){
        System.out.println("ParentBlock Constructor.");
    }
}
public class InstanceInitializerBlock extends ParentBlock{
    public InstanceInitializerBlock(){
        super();
        System.out.println("Object Initialized.");
    }

    {
        System.out.println("Instance Initializer Block Demo.");
    }

    public static void main(String[] args) {
        //new InstanceInitializerBlock();  //instance of class
        InstanceInitializerBlock obj=new InstanceInitializerBlock(); //object

    }

}
