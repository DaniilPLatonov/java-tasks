package HackerRank_tasks;

import java.io.*;
import java.util.stream.*;


class Result13 {

    public static long flippingBits(long n) {
        String a = String.format("%32s", Long.toBinaryString(n)).replaceAll(" ", "0");

        String a2 = a.replaceAll("0", "r").replaceAll("1", "0").replaceAll("r", "1");
        long n2 = Long.parseLong(a2, 2);
        return n2;
    }
}

class Solution13 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                long n = Long.parseLong(bufferedReader.readLine().trim());

                long result = Result13.flippingBits(n);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}

