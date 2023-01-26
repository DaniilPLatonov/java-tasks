package HackerRank_tasks;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;


class Result {

    public static void plusMinus(List<Integer> arr) {
        double plusCount = 0;
        double minusCount = 0;
        double nullCount = 0;
        for (Integer integer : arr) {
            if (integer < 0) {
                minusCount++;
            } else if (integer > 0) {
                plusCount++;
            } else {
                nullCount++;
            }
        }
        System.out.println(plusCount / arr.size() + "00000");
        System.out.println(minusCount / arr.size() + "00000");
        System.out.println(nullCount / arr.size() + "00000");


    }

}

public class Plus_Minus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result7.plusMinus(arr);

        bufferedReader.close();
    }
}

