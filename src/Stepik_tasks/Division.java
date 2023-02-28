package Stepik_tasks;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int m = sc.nextInt();
        if (n >= 1 && n <= Math.pow(10, 18) && m >= 2 && m <= Math.pow(10, 5)) {
            if (n % 3 == 0) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }
    }
}
