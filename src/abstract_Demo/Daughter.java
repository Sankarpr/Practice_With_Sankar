package abstract_Demo;

public class Daughter extends Parent {


    public Daughter(int age)
    {
        super(age);
    }
    void career()
    {
        System.out.println(" I am a  doctor");
    }

    @Override
    void partner() {
        System.out.println(" I love India");
    }
}
