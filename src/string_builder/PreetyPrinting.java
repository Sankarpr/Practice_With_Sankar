package string_builder;

import java.util.ArrayList;

public class PreetyPrinting {
    public static void main(String[] args) {
        float a=127.1272f;
        System.out.printf("Formatted output is %.2f", a);
        System.out.println();
        float b=127.1272f;
        System.out.printf("Formatted output is %2f", b);
        System.out.println();
        System.out.printf("Pie %.3f",Math.PI);
        System.out.println();
        System.out.printf("Hello my name is %s and I am %s", "Sankar", "from Assam");
        System.out.println();

        System.out.println("Sankar" + new ArrayList<>());
    }
}
