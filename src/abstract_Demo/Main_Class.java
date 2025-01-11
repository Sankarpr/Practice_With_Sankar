package abstract_Demo;


/*Don'ts
An abstract keyword cannot be used with variables and constructors.
If a class is abstract, it cannot be instantiated.
If a method is abstract, it doesn't contain the body.
We cannot use the abstract keyword with the final.
We cannot declare abstract methods as private.
We cannot declare abstract methods as static.
An abstract method can't be synchronized.*/

/*Do's
An abstract keyword can only be used with class and method.
An abstract class can contain constructors and static methods.
If a class extends the abstract class, it must also implement at least one of the abstract method.
An abstract class can contain the main method and the final method.
An abstract class can contain overloaded abstract methods.
We can declare the local inner class as abstract.
We can declare the abstract method with a throw clause.*/
public class Main_Class {
    public static void main(String[] args) {

        Son son = new Son(34);
        son.career();

        Daughter daughter= new Daughter(30);
        daughter.career();

        Parent.hello();
        son.normal();
        daughter.normal();
    }
}
