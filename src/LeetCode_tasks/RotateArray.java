package LeetCode_tasks;

import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int res[] = new int[n];

        for(int i=0;i<n;i++){
            res[(i+k)%n] = nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i] = res[i];
        }
        return;
    }

    public static void main(String[] args) {
        int array[] = new int[]{1,2,3,4,5,6,7};
        rotate(array, 3);
    }
}
