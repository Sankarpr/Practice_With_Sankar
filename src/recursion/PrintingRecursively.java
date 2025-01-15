package recursion;
//base condition: it is a condition where the program will stop(recursion will stop making new calls)
//it helps us in solving bigger and complex problem in simple and easy way
//We can convert recursion solution into iteration and vice versa
//space complexity is not constant of recursive call.


public class PrintingRecursively {
    public static void main(String[] args) {
        int n=6;
        print(n);

    }
    static void print(int n)
    {
        if(n>=5)
        {
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}
