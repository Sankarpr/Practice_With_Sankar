package polumorphism;

//Encapsulation: wrapping up the implementation of the data numbers and methods in a class
//Abstraction: Hiding the unnecesary details only showing valuable information.
public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Shape square = new Square();

        square.area();

    }
}
