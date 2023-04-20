package LeetCode_tasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (int key : map.keySet()) {
            if (map.get(key) == 1) return key;
        }
        return 0;
    }

    public static void main(String[] args) {
        int array[] = new int[]{2, 2, 3, 2};
        System.out.println(singleNumber(array));

    }
}
