package JetBrains_tasks.preparing;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfJunior = scanner.nextInt();
        int countOfSenior = scanner.nextInt();
        int countOfChecking = scanner.nextInt();
        int numberOfChecksNeeded = countOfJunior * countOfChecking;
        int time = 0;
        if (numberOfChecksNeeded % countOfSenior == 0) {
            time = numberOfChecksNeeded / countOfSenior;
        } else {
            time = numberOfChecksNeeded / countOfSenior + 1;
        }
        System.out.println(time);
    }
}
