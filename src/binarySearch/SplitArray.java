package binarySearch;

public class SplitArray {
    public static void main(String[] args) {

    }
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for(int i = 0 ; i< nums.length; i++)
        {
            start = Math.max(start, nums[i]);//in the end of the loop this will contains the max item from the array
            end += nums[i];
        }
        while (start<end)
        {
            int  mid= start + (end - start)/2;
            int sum = 0;
            int pieces = 1;
            for(int num : nums);
            {
                //if(sum + num > mid)
                {
                //    sum = num;
                }
            }
        }
        return end;

    }
}
