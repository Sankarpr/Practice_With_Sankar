package binarySearch;

public class InifiniteBinarySearch {
    public static void main(String[] args) {

        int[] arr={2, 3, 5, 6, 7, 10, 100, 1002, 10002};
        int target=10;
        int ans=newAns(arr,target);
        System.out.println(ans);
    }
    static int newAns(int[] arr, int target)
    {
        //first find the range
        //first start with a box of size 2
        int start=0;
        int end=1;

        //condition for the target tio lie in the range
        while(target > arr[end])
        {
            int temp = end + 1; //this is my new start
            // double the box value
            // end = previous end + sizeofbox*2
            end = end + (end - start + 1) *2;
            start = temp;
        }
        return binarySearch(arr, target,start,end);
    }
    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            //find the middle element
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid])
                start = start + 1;
            else {
                return mid;
            }
        }
        return -1;
    }
}
