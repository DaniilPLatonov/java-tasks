package JetBrains_tasks.preparing;

import java.util.HashSet;
import java.util.Set;

public class task3 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring2("aabbccddbadd"));
    }

/*    public static int lengthOfLongestSubstring3(String s) {
        StringBuilder a = new StringBuilder("abcd");
        StringBuilder s2 = new StringBuilder(s);
        int i = 0;
        int count = 0;
        while (a.length() != 0) {
        }
    }*/


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
}
