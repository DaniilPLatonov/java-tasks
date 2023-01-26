package HackerRank_tasks;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result7 {

    public static int lonelyinteger(List<Integer> arr) {
        int count = 0;
        boolean check;

        for (int i = 0; i < arr.size(); i++) {
            check = true;
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != null && arr.get(i).equals(arr.get(j))) {
                    arr.remove(j);
                    check = false;
                    break;
                }
            }
            if (check) {
                count = arr.get(i);
                break;
            }
        }
        return count;
    }

}

class Solution7 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result7.lonelyinteger(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

