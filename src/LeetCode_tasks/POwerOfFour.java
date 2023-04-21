package LeetCode_tasks;

public class POwerOfFour {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(6));
    }

    public static boolean isPowerOfFour(int n) {

        while (n >= 1) {
            if (n == 1) return true;
            if (n % 2 != 0 || n % 4 != 0) return false;
            n /= 4;
        }

        return false;
    }
}
