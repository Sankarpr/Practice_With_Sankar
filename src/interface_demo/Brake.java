package interface_demo;

public interface Brake {
void brake();
static void method1()
{
    //Hy static method in interface should always have a body because static method and variables in interface cannot be inherited"
    //while calling call via the interface name
    System.out.println("Hy static method in interface should always have a body because static method and variables in interface cannot be inherited");
}
}
