package binarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {

        int[] arr= {2,4,6,7,8,9,30,50,876};
        int target=2;
        int ans=orderAgnosticBS(arr,target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr, int target)
    {
        int start=0;
        int end=arr.length-1;



        //Chcek the given array is ASC or DSC
        boolean isASC = arr[start] < arr[end];

       while (start <= end)
       {
           if (isASC)
           {
               int mid=start + (end - start)/2;
               if (arr[mid]==target) {
                   return mid;
               }
               if(isASC) {
                   if (target < arr[mid]){
                       end = mid - 1;
                   }
                   else
                   {
                       start = mid + 1;
                   }


               }
               else
                   {
                       if (target > arr[mid])
                       {
                           end = mid -1;
                       }
                       else
                       {
                           start = mid+1;
                       }
                   }
           }
       }
       return -1;
    }
}
