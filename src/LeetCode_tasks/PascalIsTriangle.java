package LeetCode_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalIsTriangle {

    public static List<List<Integer>> generate(int numRows) {
        int [][] pascal = new int[numRows][];
        for(int i = 0; i < numRows; i++){
            pascal[i] = new int[i+1];
            pascal[i][0] = 1;
            pascal[i][i] = 1;
            for(int j = 1; j < i;j++){
               pascal[i][j] = pascal[i - 1][j - 1] +  pascal[i-1][j];
            }

        }
        return (List)Arrays.asList(pascal);
        }

        public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
