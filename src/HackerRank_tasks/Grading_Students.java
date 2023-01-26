package HackerRank_tasks;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result8 {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        boolean check;
        List<Integer> grades2 = new ArrayList<>();
        for (int i = 0; i < grades.size(); i++) {
            check = false;
            for (int k = 1; k < 3; k++) {
                if ((grades.get(i) + k) % 5 == 0 && grades.get(i) >= 38) {
                    grades2.add(grades.get(i) + k);
                    check = true;
                }
            }
            if (!check) {

                grades2.add(grades.get(i));
            }

        }
        return grades2;
    }
}

class Solution8 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result8.gradingStudents(grades);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

