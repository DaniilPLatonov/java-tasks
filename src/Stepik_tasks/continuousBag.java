package Stepik_tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.out;

public class continuousBag {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int things = scanner.nextInt();
        int volume = scanner.nextInt();
        HashMap<Integer, Integer> hashMap = new HashMap();
        for (int i = 0; i < things; i++) {
            hashMap.put(scanner.nextInt(), scanner.nextInt());
        }

    }
}
