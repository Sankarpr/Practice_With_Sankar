package recursion;

public class BS {
    public static void main(String[] args) {
        int[] arr={3,4,8,12,45,89,99};
        int target=89;
        System.out.println(bs_recursion(arr,target,0,arr.length-1));
    }
    static int bs_recursion(int[] arr, int target, int start, int end)
    {
        if (start>end)
        {
            return -1;
        }
        int mid=start + (end - start) / 2;
        if(arr[mid] == target)
        {
            return mid;
        }
        if(target < arr[mid])
        {
            return bs_recursion(arr,target,start,mid-1);
        }
        return bs_recursion(arr,target,mid+1,end);
    }
}
