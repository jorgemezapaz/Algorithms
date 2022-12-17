package medium;

public class RotateArray {
    //Problem link: https://leetcode.com/problems/rotate-array/description/
    //Space is O(n) and time is O(n).
    public static void rotateFirstSolution(int[] nums, int k){
        if(k > nums.length)
            k = k%nums.length;

        int[] result = new int[nums.length];

        for (int i=0; i < k; i++){
            result[i] = nums[nums.length-k+i];
        }
        int j=0;
        for(int i=k; i<nums.length; i++ ){
            result[i] = nums[j];
            j++;
        }
        System.arraycopy(result, 0, nums, 0, nums.length);
    }

    /**
    Can we do this in O(1) space and in O(n) time? The following solution does.
    Assuming we are given 1,2,3,4,5,6 and order 2. The basic idea is:
            1. Divide the array two parts: 1,2,3,4 and 5, 6
            2. Rotate first part: 4,3,2,1,5,6
            3. Rotate second part: 4,3,2,1,6,5
            4. Rotate the whole array: 5,6,1,2,3,4
     */
    public static void rotateSecondSolution(int[] nums, int k){
        k = k % nums.length;

        if(k < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }

        int a = nums.length - k;
        reverse(nums, 0, a-1);
        reverse(nums, a, nums.length-1);
        reverse(nums, 0, nums.length-1);
    }

    public static void reverse(int[] arr, int left, int right) {
        if (arr == null || arr.length == 1)
            return;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
