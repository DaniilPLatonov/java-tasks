package LeetCode_tasks;

import java.util.Arrays;

public class ReverseWordsInAString3 {

    public static String reverseWords(String a) {
        a = new StringBuilder(a).reverse().toString();
        String[] a2 = a.split(" ");
        int i = 0;
        int j = a2.length-1;
        while (i < a2.length / 2) {
            String temp = a2[i];
            a2[i] = a2[j];
            a2[j] = temp;

            i++;
            j--;
        }
        return new String(Arrays.toString(a2))
                .replaceAll(", ", " ")
                .replaceAll("[()<\\[\\]>]", "");
    }

    public static void main(String[] args) {
        String d = "Let's take LeetCode contest";
        System.out.println(reverseWords(d));
    }
}
