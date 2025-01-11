package sort;

import java.util.Arrays;

//checking the adjacent element of the given array and the largest element will goes to at the end and it keeps checking via same process in the next iterartion another greater number will go in the second last .....
//As the size of the array is growing the no. of comparisions is also growing
public class BubbleSort {
    public static void main(String[] args) {


        int[] arr ={40,30,20,10,5,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr)
    {
        boolean swp;

        //run the steps n-1 times
        for (int i=0;i< arr.length;i++)
        {

            swp=false;
            //for each step, max item will come at the last respective index
            for (int j=1;j<arr.length-i; j++)
            {
                if(arr[j] < arr[j-1]);
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swp=true;
                }

            }
            if (!swp)
            {
                break;
            }
        }
    }
}

