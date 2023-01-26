package HackerRank_tasks;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.stream.*;

class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextLine()) {
            System.out.println(analyze(s.nextLine()));
        }

        s.close();

    }


    public static String analyze(String input) {
        String[] split = input.split(";");
        String method = split[0];
        String type = split[1];
        String text = split[2];
        if (type.equals("M")) {
            if (method.equals("C")) {
                text = capitalize(text).replaceAll("\\s", "").substring(0, 1).toLowerCase() +
                        capitalize(text).replaceAll("\\s", "").substring(1) + "()";
            } else if (method.equals("S")) {
                text = text.replaceAll("\\p{P}", "");
                text = String.join(" ", text.split("(?=\\p{Upper})"));
                text = text.toLowerCase();
            }
        } else if (type.equals("V")) {
            if (method.equals("C")){
                text = capitalize(text).replaceAll("\\s", "").substring(0, 1).toLowerCase() +
                        capitalize(text).replaceAll("\\s", "").substring(1);
            }else if (method.equals("S")) {
                text = String.join(" ", text.split("(?=\\p{Upper})"));
                text = text.toLowerCase();
            }
        } else if (type.equals("C")) {
            if (method.equals("C")){
                text = capitalize(text).replaceAll("\\s", "");
            }else if (method.equals("S")) {
                text = String.join(" ", text.split("(?=\\p{Upper})"));
                text = text.toLowerCase();
            }

        }
        return text;
    }

    public static String capitalizeWord(String word) {
        if (word == null || word.length() == 0) {
            return word;
        }
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    public static String capitalize(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }

        return Stream.of(str.trim().split("\\s+"))
                .map(Solution::capitalizeWord)
                .collect(Collectors.joining(" "));

    }
}

