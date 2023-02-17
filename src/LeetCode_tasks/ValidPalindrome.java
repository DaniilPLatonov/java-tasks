package LeetCode_tasks;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int j = s.length() - 1;
        int i = 0;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            j--;
            i++;
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
