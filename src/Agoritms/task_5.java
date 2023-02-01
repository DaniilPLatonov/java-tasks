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
        sumFrequency(arr);
    }

    public static void sumFrequency(List <Integer> arr){

    }

}
