package LineraSearch;

import java.lang.module.FindException;
import java.util.Arrays;

public class Numberexist {
    public static void main(String[] args) {

        int arr[]={2,4,5,6,7,8,98,65,-1};
        int target=2;
        int ans= linearSearch(arr,target);
        System.out.println("The value is found at index"+ans);

    }
    /*static  int linearSearch(int[] arr,int target)
    {

        if(arr.length==0)
        {
            return -1;
        }
         for (int index:arr)
         {
             int elment=arr[index];
             if (target==elment)
             {
                 return index;
             }
             return -1;
         }
        return -1;
    }*/
static  int linearSearch(int[] arr,int target)
    {

        if(arr.length==0)
        {
            return Integer.MAX_VALUE;
        }
         for (int index:arr)
         {
             if (target==index)
             {
                 return index;
             }
             return Integer.MAX_VALUE;
         }
        return Integer.MAX_VALUE;
    }
   /* static boolean value1(int[] arr, int target) {
        if (arr.length == 0)
        {
            return false;
        }
        for(int element: arr)
        {
            if(target==element)
            {
                return true;
            }
        }
        return false;
    }*/

}
