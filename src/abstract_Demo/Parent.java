package abstract_Demo;

public abstract class Parent {

    int age;
    public Parent(int age) {
        this.age = age;
    }

    static void hello()
    {
        System.out.println("Hey");
    }
    void normal()
    {
        System.out.println("Normal test");
    }

    abstract void  career();
    abstract void  partner();
}
