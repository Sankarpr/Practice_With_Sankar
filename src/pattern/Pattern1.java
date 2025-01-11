package pattern;

public class Pattern1 {
    public static void main(String[] args) {

        int n=4;
        pattern(n);
    }
    static void pattern(int n)
    {
        for (int row=1; row <= n; row++)
        {
            for (int col=1; col <= row; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
