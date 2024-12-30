package com.basics;
//Aquiring all the properties (varuiables) and behavior(Methodes) from one class to another class is called inheritence\
//CLASS TO class extends
//
class A
{
    int a=100;
    void display()
    {
        System.out.println(a);
    }
}
class B extends A
{
    int b=10;
    void show()
    {
        System.out.println(b);
    }
}
class C extends A{
    int c=200;
    void m1()
    {
        System.out.println(c);
    }
}


public class InheritenceUse {

    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.display();
        C obj1=new C();
        obj1.m1();

    }
}
