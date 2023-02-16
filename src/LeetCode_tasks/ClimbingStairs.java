package LeetCode_tasks;

import java.util.Arrays;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        if(n == 1){
            return 1;
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[0] = 1;
            b[1] = 2;
            if (i > 1) {
                b[i] = b[i - 1] + b[i - 2];
            }
        }

        return b[b.length-1];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(45));
    }

}
