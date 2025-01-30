package MathsTricks;

public class OddEven {
    public static void main(String[] args) {
        int n = 68;
        System.out.println(odd(n));
    }

    static boolean odd(int n) {
        String ans;
        if ((n & 1) == 1) {
            return (n&1) == 1;
        }
        return false;
    }
}
