package Agoritms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            arr.add(scanner.nextInt());
        }
        System.out.println(sumFrequency(arr));
    }

    public static Integer sumFrequency(List<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int sum = arr.get(i);
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(j) % arr.get(i) == 0 && i != j) {
                    sum += arr.get(j);
                }
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }

}
