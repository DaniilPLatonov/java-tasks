package CodeWars_tasks;

import java.util.*;

 class SmileFaces {

    public static int countSmileys(List<String> arr) {
        String[] arr2 = arr.toArray(new String[0]);
        int count = 0;
        String[] arr3 = new String[]{":)", ":D", ":-)", ":~)", ":-D", ":~D", ";)", ";D", ";-)", ";~)", ";-D", ";~D"};
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr3.length; j++) {
                if(arr2[i].equals(arr3[j])){
                    count++;
                }
            }
        }
        return count;
    }
}
