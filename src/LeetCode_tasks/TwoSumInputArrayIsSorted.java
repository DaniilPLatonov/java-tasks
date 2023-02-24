package LeetCode_tasks;

import java.util.Arrays;

public class TwoSumInputArrayIsSorted {

    public static void main(String[] args) {
        int a[] = new int[]{2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(a, 9)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int begin = 0;
        int end = numbers.length - 1;
        while (begin <= end) {
            int sum = numbers[begin] + numbers[end];
            if (sum > target) {
                end--;
            } else if (sum < target) {
                begin++;
            } else {
                return new int[]{begin + 1, end + 1};
            }
        }
        return new int[]{begin + 1, end + 1};
    }
}
