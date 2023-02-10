package LeetCode_tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target - nums[i])){
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                break;
            }
            map.put(nums[i],i);
        }

        return result;
    }

    public static void main(String[] args) {
        int target = 6;
        int[] num = new int[]{3,2,4};
        System.out.println(Arrays.toString(twoSum(num, target)));
    }
}
