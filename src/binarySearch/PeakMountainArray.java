package binarySearch;

public class PeakMountainArray {
    public static void main(String[] args) {


        int arr[]={2,4,6,7,5,3,1};
        System.out.println(arr);
    }
    public int peakIndexInMountainArray(int[] arr)
    {
        int start=0;
        int end = arr.length - 1;
        while (start < end)
        {
            int mid=start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1])
            {
                //u r in the dec part of array this may be the ans, but look at left
                end = mid;//this is why end != mid-1
            }
            else {
                start = mid + 1;//beacause we know that mid + 1 element > mid element
            }
        }
        //in the end,start == end pointing to the largests number because of the 2 checks above
        //start and end always trying to find the max element in the above two checks
        //hence when they are pointing to the just one element , that is the max one beacause that is what the checks says
        return start; // or end as both are equal
    }
}
