package access;


/*private
Java private keyword
A Java private keyword is an access modifier. It can be assigned to variables, methods, and inner classes.
It is the most restricted type of access modifier.

Points to remember
The private access modifier is accessible only within the same class.
We can't assign private to outer class and interface.
The best use of private keyword is to create a fully encapsulated class in Java by making all the data members of that class private.
If we make any class constructor private, we cannot create the instance of that class from outside the class.
If we are overriding any method, overridden method (i.e., declared in the subclass) must not be more restrictive.
According to the previous point, if we assign a private modifier to any method or variable, that method or variable can be overridden
to sub-class using all type of access modifiers. However, still, we can't invoke private method outside the class*/


/*Java protected keyword
A Java protected keyword is an access modifier. It can be assigned to variables, methods, constructors and inner classes.

Points to remember
The protected access modifier is accessible within the package. However, it can also accessible outside the package but through inheritance only.
We can't assign protected to outer class and interface.
If you make any constructor protected, you cannot create the instance of that class from outside the package.
If you are overriding any method, overridden method (i.e., declared in the subclass) must not be more restrictive.
According to the previous point, if you assign protected to any method or variable, that method or variable can be
overridden to sub-class using public or protected access modifier only.*/

/*Java public keyword
A Java public keyword is an access modifier. It can be assigned to variables, methods, constructors, and classes. It is the most non-restricted type of access modifier.

Points to remember
The public access modifier is accessible everywhere. So, we can easily access the public inside and outside the class and package.
If you are overriding any method, overridden method (i.e., declared in the subclass) must not be more restrictive. So, if you assign public to any method or variable, t
hat method or variable can be overridden to sub-class using public access modifier only.
If a program contains multiple classes, at most one class can be assigned as public.
If a class contain a public class, the name of the program must be similar to the public class name.*/


public class A {
    int nmr;
    String name;
    int[] arr;

    public int getNmr() {
        return nmr;
    }
    public void setNmr() {
        this.nmr=nmr;
    }

    public A(int nmr, String name) {
        this.nmr = nmr;
        this.name = name;
        this.arr = new int[nmr];
    }
}
