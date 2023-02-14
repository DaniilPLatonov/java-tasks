package JetBrains_tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int numNegative = Integer.MIN_VALUE;
        int numPositive = Integer.MAX_VALUE;
        List<Integer> listCount = new ArrayList<>();
        List<Boolean> negativeTemp = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            listCount.add(scanner.nextInt());
            negativeTemp.add(scanner.next().equals("0+"));
        }

        for (int i = listCount.size() - 1; i >= 0; i--) {
            if (!negativeTemp.get(i)) {
                numNegative = i;
                break;
            }else {
                numPositive = i;
            }
        }

        if (numNegative == Integer.MIN_VALUE || numPositive == Integer.MAX_VALUE) {
            System.out.println("Inf");
        } else {
            int num = -1;
            for (int i = numNegative + 1; i < listCount.size(); i++) {
                num += listCount.get(i);
            }
            System.out.println(num);
        }
    }
}
