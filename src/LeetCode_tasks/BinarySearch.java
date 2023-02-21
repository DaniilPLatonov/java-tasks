package LeetCode_tasks;

public class BinarySearch {

    public static int search(int[] nums, int target) {
         for(int i = 0; i < nums.length; i++){
             if(nums[i] == target){
                 return i;
             }
         }
         return -1;
    }

    public static void main(String[] args) {
        int nums[] = new int[]{-1, 0, 3, 5, 9, 12};
        System.out.println(search(nums, 9));
    }
}
