package staticExample;

public class StaticBlock {
    static int a=4;
    static int b;

    //will run  only once when the first object is created and when the class will load for the first time.
    static {
        System.out.println("I am static block");
        b=a*5;
    }

    public static void main(String[] args) {
        StaticBlock obj= new StaticBlock();
        System.out.println("values : a & b: "+ a +" " + b );
    }
}
