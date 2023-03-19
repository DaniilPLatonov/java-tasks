package JetBrains_tasks.preparing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayOfPerson = new int[4];
        int i = 0;
        while (i < arrayOfPerson.length) {
            arrayOfPerson[i] = scanner.nextInt();
            i++;
        }
        System.out.println(isAlwaysIncreasingOrDecreasing(arrayOfPerson));
    }

    public static String isAlwaysIncreasingOrDecreasing(int[] sequence) {

        int previous = sequence[0];
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 1; i < sequence.length; i++) {
            if (previous < sequence[i]) {
                decreasing = false;
                if (!increasing) {
                    break;
                }
            } else if (previous > sequence[i]) {
                increasing = false;
                if (!decreasing) {
                    break;
                }
            }
            previous = sequence[i];
        }
        if (decreasing || increasing) {
            return "YES";
        }
        return "NO";
    }
}
