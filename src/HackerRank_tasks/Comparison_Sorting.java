package HackerRank_tasks;

import java.io.*;

import java.util.*;


class Result16 {

    public static List<Integer> countingSort(List<Integer> arr) {
        int max = 0;
        for (Integer integer : arr) {
            if (integer > max) {
                max = integer;
            }
        }
        Integer[] a = new Integer[max + 1];
        Arrays.fill(a, 0);
        for (Integer integer : arr) {
            a[integer]++;
        }
        return new ArrayList<>(Arrays.asList(a));
    }

}

class Solution16 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        List<Integer> result = Result16.countingSort(arr);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
