package HackerRank_tasks;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;



     class Result2 {
        public static void miniMaxSum(List<Long> arr) {
            long[] array = new long[arr.size()];
            for (int i = 0; i < arr.size(); i++) {
                for (int j = 0; j < arr.size(); j++) {
                    if (j == i) {
                    } else {
                        array[i] += arr.get(j);
                    }
                }
            }

            long max = Arrays.stream(array)
                    .max()
                    .getAsLong();

            long min = Arrays.stream(array)
                    .min()
                    .getAsLong();
            System.out.println(min + " " + max);
        }

    }

    class Mini_Max_Sum  {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            List<Long> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Long::parseLong)
                    .collect(toList());

            Result2.miniMaxSum(arr);

            bufferedReader.close();
        }
    }


