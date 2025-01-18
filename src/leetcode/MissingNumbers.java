package leetcode;

import java.util.Arrays;

public class MissingNumbers {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        missingNumber(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int missingNumber(int[] nums) {
        int i=0;
        while(i < nums.length)
        {
            int correct=nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct])
            {
                swap(nums, i, correct);
            }
            else
            {
                i++;
            }
            //serch for missing Index
            for (int index=0; index < nums.length ; index ++)
            {
                if(nums[index] != index){
                    return index;
                }
            }

        }
        return nums.length;
    }
    static void swap(int[] arr, int f, int l)
    {
        int temp = arr[f];
        arr[f]=arr[l];
        arr[l]=temp;
    }
}
