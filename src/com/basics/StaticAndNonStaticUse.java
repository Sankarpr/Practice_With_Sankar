package com.basics;
//static staff can acess static staff directly without any object in the same class
//to access in different class we need to specify the class namm.varibale or method name

//static method can acces non static staff with the help of object only
// non static method can acces all the static and non static variable and method directly without any restriction

public class StaticAndNonStaticUse {
    static int a=10;
    int b=290;
    static void mi()
    {
        System.out.println("static method");
    }
    void m2()
    {
        System.out.println("non static value");
    }

    public static void main(String[] args)
    {


    }
}
