package LeetCode_tasks;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int a = 1;

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] < nums[i+1]){
                nums[a] = nums[i+1];
                a++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int [] a = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(a));
    }
}
