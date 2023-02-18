package LeetCode_tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int ans=0;
        for (int num : nums) {
            ans ^= num;
        }
        return ans;
    }

    public static void main(String[] args) {
        int array[] = new int[]{4, 1, 5, 5, 1, 2};
        System.out.println(singleNumber(array));

    }
}
