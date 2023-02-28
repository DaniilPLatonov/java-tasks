package Stepik_tasks;

import java.util.Scanner;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        try {

            if (a >= 1 && a <= 2 * Math.pow(10, 9) && b >= 1 && b <= 2 * Math.pow(10, 9)) {

                while (true) {
                    if (a == 0) {
                        System.out.println(b);
                        break;
                    }
                    if (b == 0) {
                        System.out.println(a);
                        break;
                    }
                    if (a >= b && b != 0) {
                        a = a % b;
                    }
                    if (b >= a && a != 0) {
                        b = b % a;
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
