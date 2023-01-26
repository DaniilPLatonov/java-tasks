package HackerRank_tasks;

import java.io.*;

class Result10 {

    public static int countingValleys(int steps, String path) {
        if (path.length() == steps) {
            int countSteps = 0;
            int temp = 0;
            String[] pathArray = path.split("");
            for (String s : pathArray) {
                if (s.equals("U")) {
                    temp++;
                } else if (s.equals("D")) {
                    temp--;
                }
                if (temp == -1 && s.equals("D")) {
                    countSteps++;
                }
            }
            return countSteps;

        } else {
            return 0;
        }

    }

}

 class Solution10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Result10.countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

