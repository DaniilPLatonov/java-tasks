package LeetCode_tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int j = str.length() - 1;
        for (int i = 0; i <= j; i++) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }
}
