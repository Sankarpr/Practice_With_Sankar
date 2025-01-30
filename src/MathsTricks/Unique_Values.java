package MathsTricks;

public class Unique_Values {
    public static void main(String[] args) {
        int[] arr = {3,4,5,5,4,3,7};
        System.out.println(uniquew(arr));
    }

    private static int uniquew(int[] arr) {
        int unique = 0;
        for(int n:arr)
        {
            unique ^= n;
        }
        return unique;
    }
}
