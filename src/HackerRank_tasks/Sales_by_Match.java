package HackerRank_tasks;

import java.io.*;
import java.util.*;

class Result14 {

    public static int sockMerchant(int n, List<Integer> ar) {
        int count = 0;
        if (n == ar.size()) {
            Collections.sort(ar);
            for (int i = 0; i < n-1 ; i++) {
                if (Objects.equals(ar.get(i), ar.get(i + 1))) {
                    count++;
                    i++;
                }
            }

        }
        return count;
    }

}

 class Solution14 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> ar = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arTemp[i]);
            ar.add(arItem);
        }

        int result = Result14.sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
