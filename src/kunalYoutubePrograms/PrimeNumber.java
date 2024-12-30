package kunalYoutubePrograms;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean res= (isPrime(n));
        System.out.println(res);
    }
    static boolean isPrime(int n)
    {
        if(n < 1)
        {
            return false;
        }
        int val=2;
        while(val * val <= n)
        {
            if(n % val == 0)
            {
                return false;
            }
            val++;
        }
        return (val * val > n);
    }
}