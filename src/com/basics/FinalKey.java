package com.basics;
//The final key can apply on class method, variables
//We cannot chnage the value of the variables(it is like constant)
//we cannot override the final method
// we cannot extend the final class
class F
{
    final int a=100;
    int b=1000;
}
public class FinalKey {
    public static void main(String[] args) {
        F obj=new F();
        obj.b=200;
        //obj.a=100; cannot chnage because it is final variable
        System.out.println(obj.b);
        System.out.println(obj.a);
    }
}
