package array;

import javax.swing.*;

public class PrintingSubarray {
    public static void main(String[] args) {

        int[] arr={1,2,3,4};
        subarray(arr);

    }

    static void subarray(int[] arr) {
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                System.out.print("[");
                for (int i = start; i <=  end; i++) {
                    System.out.print(arr[i]);
                    if( i <end)
                    {
                        System.out.print(", ");
                    }
                }
                System.out.println("]");
            }

        }
    }
}