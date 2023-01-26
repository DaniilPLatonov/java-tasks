package HackerRank_tasks;

import java.io.*;
import java.util.*;

class Result11 {

    public static String pangrams(String s) {
        s = s.toLowerCase();
        char[] ch = s.toCharArray();

        int end = ch.length;
        Set<Character> set = new HashSet<Character>();

        for (char c : ch) {
            set.add(c);
        }
        if(set.size() == 27){
            return "pangram";
        }else{
            return "not pangram";
        }

    }
}

class Solution11 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result11.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

