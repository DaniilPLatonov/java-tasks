package HackerRank_tasks;
import java.io.*;
import java.util.*;

class Result22 {

    public static int pickingNumbers(List<Integer> a) {
        int count = 1;
        int max = 0;
        boolean check;
        for(int i = 1; i < a.size(); i++) {
            check = true;
            if (a.get(i) - a.get(i - 1) <= 1 && a.get(i) - a.get(i - 1) >= -1) {
                count++;
            } else {
                check = false;
            }
            if (!check || i == a.size()-1) {
                if (max < count) {
                    max = count;
                    count = 1;
                }

            }
        }
        return max;
    }

}

class Solution22 {
    public static void main(String[] args) throws IOException {

        List<Integer> a = new ArrayList<>(Arrays.asList(4,6,5,3,3,1));

        int result = Result22.pickingNumbers(a);
        System.out.println(result);
    }
}

