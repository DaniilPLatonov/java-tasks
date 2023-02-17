package LeetCode_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle2 {

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> integerList = new ArrayList<>();
        if(rowIndex == 0){
            integerList.add(1);
            return integerList;
        }
        if(rowIndex == 1){
            integerList.add(1);
            integerList.add(1);
            return integerList;
        }
        int [][] pascal = new int[rowIndex+1][];
        boolean check = true;
        integerList.add(1);
        for(int i = 1; i < rowIndex+1; i++){
            pascal[i] = new int[i+1];
            pascal[i][0] = 1;
            pascal[i][i] = 1;

            for(int j = 1; j < i;j++){
                pascal[i][j] = pascal[i - 1][j - 1] +  pascal[i-1][j];
                if(rowIndex == i){
                    integerList.add(pascal[i][j]);
                }
            }
        }
        integerList.add(1);
        return integerList;
    }

    public static void main(String[] args) {
        System.out.println(getRow(3));
    }
}
