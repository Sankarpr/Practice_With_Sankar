package leetcode;

public class RichestCustomerWealthTwoDArray {
    public static void main(String[] args) {

        int [][] arr={
                {1,5},
                {9,9},
                {8,9}
        };
        System.out.println(maxValue(arr));
    }
    static int maxValue(int[][] accounts)
    {
        int ans=0;
        for (int[] row : accounts)
        {
            int sum=0;
            for (int col : row)
            {
               sum += col;
            }
            if (sum > ans)
            {
                ans = sum;
            }
        }
        return ans;
    }
}
