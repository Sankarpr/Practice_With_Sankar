package sort;

import java.util.Arrays;

//Insertion sortWe start with second element of the array as first element in the array is assumed to be sorted.
//Compare second element with the first element and check if the second element is smaller then swap them.
//Move to the third element and compare it with the first two elements and put at its correct position
//Repeat until the entire array is sorted.
//steps are reduced, no of swapes reduced , it is stable, used for smaller value of n
public class InsertionSort {
    public static void main(String[] args) {
       int[] arr={3,6,98,5,6};
       selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr)
    {
        for(int i=0;i<arr.length - 1; i++)
        {
            for (int j=i+1; j>0; j--)
            {
                if(arr[j] < arr[j-1])
                {
                    swap(arr,j,j-1);
                }
                else {
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int first, int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }

}
