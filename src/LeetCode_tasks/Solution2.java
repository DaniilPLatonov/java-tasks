package LeetCode_tasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution2 {

    public static int lengthOfLongestSubstring2(String s) {
        Set<Character> hashset = new HashSet<>();
        int max = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            if (!hashset.contains(s.charAt(right))) {
                hashset.add(s.charAt(right));
                max = Math.max(max, right - left + 1);

            } else {
                while (s.charAt(left) != s.charAt(right)) {
                    hashset.remove(s.charAt(left));
                    left++;
                }
                hashset.remove(s.charAt(left));
                left++;
                hashset.add(s.charAt(right));
            }

        }
        return max;
    }


    public static void main(String[] args) {
        String a = "abcabcbb";
        int b = lengthOfLongestSubstring2(a);
        System.out.println(b);
    }
}
