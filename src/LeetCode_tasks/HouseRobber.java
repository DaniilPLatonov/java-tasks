package LeetCode_tasks;

public class HouseRobber {

    public static int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        int num = Math.max(nums[0], nums[1]);
        int num2 = nums[0];
        for (int i = 2; i < nums.length; i++) {
            int cur = Math.max(nums[i] + num2, num);
            num2 = num;
            num = cur;
        }
        return num;
    }

    public static void main(String[] args) {
        int num[] = {2, 7, 9, 3, 1};
        System.out.println(rob(num));
    }
}
