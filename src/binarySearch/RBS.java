package binarySearch;

public class RBS {
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,4,3,1};
        System.out.println(findPivot(arr));
    }
    public int search(int[] nums, int target)
    {
        int pivot = findPivot(nums);
        //if no pivot array is not rotated
        if(pivot == -1 )
        {
            return binarSearch(nums,target,0,nums.length - 1);
        }
        if (nums[pivot]==target)
        {
            return pivot;
        }
        if (target >= nums[0])
        {
            return binarSearch(nums, target,0,pivot - 1);
        }
        return binarSearch(nums, target, pivot + 1, nums.length-1);
    }
    static int binarSearch(int nums[], int target, int start, int end)
    {
        while (start <= end)
        {
            int mid = start + (end - start) / 2;
            if (target < nums[mid])
            {
                end = mid - 1;
            }
            else if (target > nums[mid])
            {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }


    //this will not work in duplicate values
    static int findPivot(int arr[])
    {
        int start=0;
        int end=arr.length - 1;
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            //4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1] )
            {
                return  mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1])
            {
                return mid - 1;
            }
            if (arr[mid] <= arr[start])
            {
                end = mid - 1;
            }
            else {
                 start = mid + 1;
            }
        }
        return - 1;
    }
    static int findPivotWithDuplicates(int arr[])
    {
        int start=0;
        int end=arr.length - 1;
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            //4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1] )
            {
                return  mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1])
            {
                return mid - 1;
            }
            //if elements at middle, start, and end are equal than skip the duplicates
            if(arr[mid]== arr[start] && arr[mid] == arr[end])
            {
                //skip the duplicates
                //check those are pivot ot not
                if(arr[start] > arr[start+1])
                {
                    return start;
                }
                start++;

                //check end is pivot or not
                if(arr[end] < arr[end-1])
                {
                    return end - 1;
                }
                end --;
            }
            //left site is sorted , so pivot in shold be in the right
            else if (arr[start] < arr[mid] || (arr[start]==arr[mid] && arr[mid] > arr[end]))
            {
                start=mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        return - 1;
    }


}
