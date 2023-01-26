package HackerRank_tasks;

import java.io.*;
import java.util.*;

class Result15 {

    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        List<Integer> arr = new ArrayList<>();
        long max = 0;
        long perimeter;
        Collections.sort(sticks);
        for (int i = 0; i < sticks.size() - 2; i++) {
            perimeter  = 0;
            if ((sticks.get(i) + sticks.get(i + 1) > sticks.get(i + 2)) || (Objects.equals(sticks.get(i), sticks.get(i + 1)) && Objects.equals(sticks.get(i), sticks.get(i + 2)))) {
                perimeter = (sticks.get(i) + sticks.get(i + 1));
                perimeter += sticks.get(i+2);
                if(perimeter > max){
                    max = perimeter;
                    arr.clear();
                    arr.add(sticks.get(i));
                    arr.add(sticks.get(i+1));
                    arr.add(sticks.get(i+2));
                }
            }
        }
        if(arr.isEmpty()){
            arr.add(-1);
        }

        return arr;
    }

}

 class Solution15 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] sticksTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> sticks = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int sticksItem = Integer.parseInt(sticksTemp[i]);
            sticks.add(sticksItem);
        }

        List<Integer> result = Result15.maximumPerimeterTriangle(sticks);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

