package CodeWars_tasks;

import java.util.Arrays;

class Solution3 {
    public static String camelCase(String input) {
        String [] result = input.split("(?=[A-Z])");
        String b = Arrays.toString(result).replaceAll("^\\[|\\]$","").replaceAll(",","");
        return b;
    }
}
