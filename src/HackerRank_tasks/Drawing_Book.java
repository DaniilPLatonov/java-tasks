package HackerRank_tasks;

import java.io.*;

class Result18 {

    public static int pageCount(int n, int p) {
        int pageUP = 0;
        int pageDown = 0;
        for (int i = 1; i < n; i++) {

            if (i == p) {
                break;
            }
            if (i % 2 != 0) {
                pageUP++;
            }
        }

        for (int j = n; j > 0; j--) {
            if (j == p) {
                break;
            }
            if (j % 2 == 0) {
                pageDown++;
            }
        }

        return Math.min(pageUP, pageDown);
    }

}

 class Solution18 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result18.pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
