package com.basics;
// 4 rules are applicable
//1 method nams should be same
//2 Number of parameters should be different
//Data type of paramteres should be different
//order of paremeteres should be different
public class Polymorphism {
    int a=10;
    int b=20;
    void sum()
    {
        System.out.println(a+b);
    }
    void sum(int a)
    {
        System.out.println(a);
    }

    public static void main(String[]args)
    {
        Polymorphism obj=new Polymorphism();
        obj.sum();


    }
}
