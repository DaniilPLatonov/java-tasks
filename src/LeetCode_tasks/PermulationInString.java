package LeetCode_tasks;

import java.util.Arrays;
import java.util.Objects;

public class PermulationInString {
    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int[] counts1 = new int[26], counts2 = new int[26];
        int len1 = s1.length(), len2 = s2.length();
        for (int i = 0; i < len1; ++i) {
            counts1[s1.charAt(i)-'a']++;
            counts2[s2.charAt(i)-'a']++;
        }
        if (Arrays.equals(counts1, counts2)) return true;
        for (int i = len1; i < len2; ++i) {
            counts2[s2.charAt(i) - 'a']++;
            counts2[s2.charAt(i-len1)-'a']--;
            if (Arrays.equals(counts1, counts2)) return true;
        }
        return false;
    }



    public static void main(String[] args) {
        System.out.println(checkInclusion("ab", "eidbaooo"));
    }
}
