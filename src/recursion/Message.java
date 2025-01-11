package recursion;
//by calling one function print 5 time hello world

//while the function is not finished executing it will remain in stack
//primitive will store in stack memory.
//When a method is completing it's execution it's removed from the stack

public class Message {
    public static void main(String[] args) {
       msg();
    }
    static void msg(){
        System.out.println("Hello world");
        msg2();
    }
    static void msg2()
    {
        System.out.println("Hello world");
        msg3();
    }
    static void msg3(){
        System.out.println("Hello world");
        msg4();
    }
    static void msg4()
    {
        System.out.println("Hello world");
        msg5();
    }
    static void msg5(){
        System.out.println("Hello world");
        msg6();
    }
    static void msg6()
    {
        System.out.println("Hello world");
    }
}
