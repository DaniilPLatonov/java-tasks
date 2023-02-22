package LeetCode_tasks;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int a[] = new int[]{0, 1, 0, 3, 12};
        moveZeroes(a);
    }

    public static void moveZeroes(int[] nums) {
        int t = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
              t++;
            }else if(t >0){
                int a = nums[i];
                nums[i] = 0;
                nums[i - t] = a;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
