package binarySearch;

public class BinarySearchInArray {
    public static void main(String[] args) {

        int[] arr= {2,4,6,7,8,9,30,50,876};
        int target=6;
        int ans=binarySearch(arr,target);
        System.out.println(ans);
    }
    static int binarySearch(int arr[],int trget)
    {
        int start=0;
        int end=arr.length-1;

        while (start <= end)
        {
            int mid = start + (end-start) / 2;
            if(trget < arr[mid])
            {
                end = mid - 1;
            } else if (trget > arr[mid])
            {
                start = mid + 1;
            }
            else {
                return mid;
            }

        }
        return -1;
    }

}
