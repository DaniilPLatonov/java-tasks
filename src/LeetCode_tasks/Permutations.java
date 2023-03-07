package LeetCode_tasks;

import java.util.*;

public class Permutations {

    public static List<List<Integer>> permute(int[] nums) {
        LinkedList<List<Integer>> res = new LinkedList<List<Integer>>();
        int rSize;
        res.add(new ArrayList<Integer>());
        for (int num : nums) {
            rSize = res.size();
            while (rSize > 0) {
                List<Integer> permution = res.pollFirst();
                for (int i = 0; i <= permution.size(); i++) {
                    List<Integer> newPerm = new ArrayList<Integer>(permution);
                    newPerm.add(i, num);
                    res.add(newPerm);
                }
                rSize--;
            }
            System.out.println(res);
        }
        return res;
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start){
        list.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }


    public static void main(String[] args) {
        int b[] = new int[]{1, 2, 3};
        System.out.println(subsets(b));
    }

}
