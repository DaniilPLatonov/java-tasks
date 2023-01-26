package HackerRank_tasks;

import java.io.*;
import java.util.*;

class Result12 {

    public static int marsExploration(String s) {
        String[] s2 = s.split("");

        int countOther = 0;
        for (int i = 0; i < s2.length; i++) {
            if (!Objects.equals(s2[i], "S") && (i % 3 == 0 || i % 3 == 2)) {
                countOther++;

            } else if (!Objects.equals(s2[i], "O") && (i % 3 == 1)) {
                countOther++;
            }
        }
        return countOther;

    }

}

 class Solution12 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result12.marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

