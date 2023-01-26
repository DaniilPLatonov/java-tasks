package HackerRank_tasks;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result9 {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int count1 = 0;
        int count2 = 0;
        int i = 0;
        Integer[][] arr3 = new Integer[(arr.size())][];
        for (List<Integer> l: arr) {
            arr3[i++] = l.toArray(new Integer[l.size()]);
        }

        int maxl = arr3.length-1;
        for (int j = maxl; j >= 0; j--) {
            count1 += arr3[j][j];
        }
        for (int k = maxl; k >= 0; k--) {
            count2 += arr3[k][maxl - k];
        }
        return Math.abs(count1-count2);


    }

}

 class Solution9 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result9.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

