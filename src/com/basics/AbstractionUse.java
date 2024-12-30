package com.basics;
//Abstration is the process of hiding the implementation details and showing only the functionality to the user.
//
interface Shape
{
    int l=20;//final and static
    int b=10;//final n  static method
    void circle();// abstarct methods
    static void square()
    {
        System.out.println("hello Interface");
    }
    default void rectangle()
    {
        System.out.println("Hello abstarct");
    }
}
public class AbstractionUse implements Shape {
    public void circle()
    {
        System.out.println("interface method cannot be directly implemented by reducing the visivility");
    }
    public static void main(String[] args) {
        AbstractionUse obj=new AbstractionUse();
        obj.circle();//abstarct
        obj.rectangle();//default
        Shape.square();//this is static interface which can be access via interface only in the class


        //scenerio2
        Shape sh=new AbstractionUse();
        sh.circle();//abstract
        sh.rectangle();//default
        Shape.square();//static method can be directly access via interface no need of object

    }


}
