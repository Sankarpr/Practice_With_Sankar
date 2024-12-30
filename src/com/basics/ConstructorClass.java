package com.basics;
//

public class ConstructorClass {
    int x,y;
    ConstructorClass()
    {
        x=100;
        y=200;
    }
    ConstructorClass(int a,int b)
    {
        x=a;
        y=b;
    }
    void sum()
    {
        System.out.println(x+y);

    }
    public static void main(String[] args) {
        ConstructorClass cd=new ConstructorClass();
        cd.sum();

    }
}
