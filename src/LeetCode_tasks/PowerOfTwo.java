package LeetCode_tasks;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {

        while (n >= 1) {
            if (n == 1 ) return true;
            if(n % 2 != 0) return false;
            n /= 2;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(6));
    }

}
