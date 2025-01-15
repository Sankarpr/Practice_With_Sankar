package pattern;

public class Pattern6 {
    public static void main(String[] args) {
        int n=5;
        pattern6(n);
    }
    static void pattern6(int n)
    {
        for (int row=0; row<2*n; row++)
        {
            int totalColCntinRow=row>n?2*n-row: row;
            int sopaces=n-totalColCntinRow;
            for (int s=0;s<sopaces;s++)
            {
                System.out.print(" ");
            }
            for (int col=0; col<totalColCntinRow;col++)
            {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
