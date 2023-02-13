package LeetCode_tasks;

public class LengthOfLastword {
    public static int lengthOfLastWord(String s) {
       String [] str = s.split(" ");
       return str[str.length-1].length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello"));
    }
}
