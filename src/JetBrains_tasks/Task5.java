package JetBrains_tasks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            arr.add(scanner.nextInt());
        }
        arr.sort(Comparator.naturalOrder());

        System.out.println(sumFrequency(arr));
    }

    public static Integer sumFrequency(List<Integer> arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            int sum = arr.get(i);
            for (int j = 0; j < arr.size(); j++) {
                if(i < j){
                    if (arr.get(j) % arr.get(i) == 0){
                        sum += arr.get(j);
                    }else{
                        sum += value(arr.get(j) , arr.get(i));
                    }
                }
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }

    public static Integer value(int val, int num){
        while (val % num != 0 && val > 1){
            val--;
        }
        return val;
    }

}
