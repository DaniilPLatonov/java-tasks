package LeetCode_tasks;

public class PowerOfThree {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(-1));
    }

    public static boolean isPowerOfThree(int n) {
        while (n >= 1) {
            if (n == 1) return true;
            if (n % 3 != 0) return false;
            n /= 3;
        }

        return false;
    }
}
