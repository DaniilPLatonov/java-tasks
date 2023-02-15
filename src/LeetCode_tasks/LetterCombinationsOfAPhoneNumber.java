package LeetCode_tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
    static HashMap<Integer, String> hashMap = new HashMap<>();
    static List<String> list = new ArrayList<>();

    public static List<String> letterCombinations(String digits) {
        hashMap.put(2, "abc");
        hashMap.put(3, "def");
        hashMap.put(4, "ghi");
        hashMap.put(5, "jkl");
        hashMap.put(6, "mno");
        hashMap.put(7, "pqrs");
        hashMap.put(8, "tuv");
        hashMap.put(9, "wxyz");
        if (digits.length() == 0) {
            return list;
        }
        calculator(digits, new StringBuilder(), 0);
        return list;
    }

    public static void calculator(String digits, StringBuilder sb, int i) {
        if (i == digits.length()) {
            list.add(sb.toString());
            return;
        }
        for (char c : hashMap.get(Integer.parseInt(String.valueOf(digits.charAt(i)))).toCharArray()) {
            sb.append(c);
            calculator(digits, sb, i + 1);
            sb.deleteCharAt(sb.length() - 1);
        }

    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("235"));
    }

}
