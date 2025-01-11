package sort;
//Swapped with correct index find theb max element in the array and swapped with the last index and next with second last

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,2,1,4,5};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            int last = arr.length - i -1;
            int macIndex= getMaxIndex(arr,0,last);
            swap(arr,macIndex,last);
        }
    }
    static void swap(int[] arr, int first, int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }
    static int getMaxIndex(int[] arr, int start, int end)
    {
        int max=start;
        for (int i = 0; i<=end; i++)
        {
            if (arr[max] < arr[i])
            {
                max=i;
            }
        }
        return max;
    }
}
