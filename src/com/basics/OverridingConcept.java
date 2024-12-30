package com.basics;
/*
Method ovverriding
Possible only in multiple classses(inheritence)
We shoudn't Not change the signature of the method but body we should change
method names are same
belongs to inhritence

<METHOD OVRLOADING
posssible in single and multiple classes(inheritence)
WE should chnage the signature of the method
mmethod names are same
belongs to polymorphism
 */

class X
 {
int m1(int a)
{
    System.out.println("MEHTOD 1");
    return (a);
}
int m2(int b)
{
    System.out.println(b);
    return b;
}
}
class Z extends X
{
    int m1(int a)//overriding
    {
        System.out.println(a*a);
        return a*a;
    }
    int m2(int b, int c)//overloading
    {
        System.out.println("hello");
        return b+c;
    }

}
public class OverridingConcept {
    //int a=10;
    public static void main(String[] args) {
        Z ob = new Z();
        System.out.println(ob.m2(3,5));
        System.out.println(ob.m1(4));

    }

}
