package binarySearch;

public class FirstAndLastPositionArray {
    public static void main(String[] args) {

    }
    public int[] searchRange(int[] nums, int target)
    {
        int[] ans = {-1 , -1};
        ans[0] =search(nums, target,true);
        if(ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    //this function  will the target index
    int search(int[] nums, int target, boolean findStartIndex)
    {
        int ans=-1;
        int start=0;
        int end=nums.length-1;

        while(start <= end)
        {
            int mid=start+(end-start);
            if(target < nums[mid])
            {
                end = mid - 1;
            }
            else if(target > nums[mid])
            {
                start = mid + 1;
            }
            else {
                ans = mid;
                if(findStartIndex)
                {
                    end=mid-1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
