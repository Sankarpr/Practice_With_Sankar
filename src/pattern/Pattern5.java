package pattern;

public class Pattern5 {
    public static void main(String[] args) {
        int n=5;
        patern5(n);
    }
    static void patern5(int n)
    {
        for (int row=0; row<2*n; row++)
        {
            int totalColCntinRow=row>n?2*n-row: row;
            for (int col=0; col<totalColCntinRow;col++)
            {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
