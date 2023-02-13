package LeetCode_tasks;

public class SearchInsertPOsition {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3};
        System.out.println(searchInsert(nums, 0));
    }

    public static int searchInsert(int[] nums, int target) {
        if (nums == null) return 1;
        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[nums.length - 1] < target) return nums.length;
            if (nums[i] == target) return i;
            if (nums[i] < target && nums[i + 1] > target) return i + 1;

        }
        return 0;
    }
}
