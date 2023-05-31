package Croc;

import java.util.Scanner;

public class Main2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] exchangeRates = new int[n];
        for (int i = 0; i < n; i++) {
            exchangeRates[i] = scanner.nextInt();
        }

        long sum = 0;
        for (int i = 0; i < k; i++) {
            sum += exchangeRates[i];
        }

        long maxSum = sum;
        int maxSegments = 1;

        for (int i = k; i < n; i++) {
            sum += exchangeRates[i] - exchangeRates[i - k];
            if (sum > maxSum) {
                maxSum = sum;
                maxSegments = 1;
            } else if (sum == maxSum) {
                maxSegments++;
            }
        }

        long gcd = gcd(maxSum, maxSegments);
        long numerator = maxSum / gcd;
        long denominator = maxSegments / gcd;

        System.out.println(numerator + "/" + denominator);
        System.out.println(maxSegments);
    }

    private static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}