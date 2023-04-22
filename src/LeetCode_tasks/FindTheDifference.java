package LeetCode_tasks;

public class FindTheDifference {
    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd", "abcde"));
    }

    public static char findTheDifference(String s, String t) {
        int randomLetter=0;
        for(char c:s.toCharArray())
            randomLetter-=c;
        for(char c:t.toCharArray())
            randomLetter+=c;
        return (char) randomLetter;
    }
}
