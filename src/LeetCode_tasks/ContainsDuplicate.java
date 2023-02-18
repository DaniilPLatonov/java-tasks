package LeetCode_tasks;

import java.util.Arrays;
import java.util.Collections;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                return true;

            }
        }

        return false;
    }


    public static void main(String[] args) {
        int a[] = new int[]{1, 2, 3, 4};
        System.out.println(containsDuplicate(a));
    }
}
