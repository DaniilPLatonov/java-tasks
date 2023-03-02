package Stepik_tasks;

import java.util.Scanner;

public class remainderOfTheDivision {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int m = sc.nextInt();
        long[] f = new long[(int) n + 1];
        f[0] = 0;
        f[1] = 1;
        if (n >= 1 && n <= Math.pow(10, 18) && m >= 2 && m <= Math.pow(10, 5)) {
            for (int i = 2; i <= n; i++) {
                long a = (f[i - 1]% m + f[i - 2]% m) % m;
                f[i] = a % m;
            }
            System.out.println(f[f.length-1] % m);
        }
    }
}
