package abstract_Demo;

public class Son extends Parent {

    public Son(int age)
    {
        super(age);
    }
    @Override
    void normal()
    {
        super.normal();
    }

    @Override
    void career(){
        System.out.println("I am an Engineer");

    }

    @Override
    void partner() {
        System.out.println("I love India too" );
    }

}
