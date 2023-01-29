package HackerRank_tasks;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;

class Result19 {

    public static int migratoryBirds(List<Integer> arr) {
        HashMap<Integer, Integer> arr2 = new HashMap<>();
        int count = 0;
        Double maxKey = Double.POSITIVE_INFINITY;
        int maxValue = 0;
        for (Integer integer : arr) {
            if (arr2.containsKey(integer)) {
                arr2.put(integer, arr2.get(integer) + 1);
            } else {
                arr2.put(integer, 1);
            }
            if (arr2.get(integer) > maxValue) {
                maxValue = arr2.get(integer);
            }
        }

        for (var entry : arr2.entrySet()) {
            if (entry.getValue() == maxValue && maxKey > entry.getKey()) {
                maxKey = Double.valueOf(entry.getKey());
                count = entry.getKey();
            }

        }

        return count;
    }

}

class Solution19 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result19.migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

