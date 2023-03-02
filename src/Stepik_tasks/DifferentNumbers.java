package Stepik_tasks;

import java.util.*;

public class DifferentNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        ArrayList<Object> s = new ArrayList<Object>();
        int i = 0;
        while (true) {
            i++;
            if (i * 2 < a) {
                s.add(i);
                a = a - i;
            } else {
                s.add(a);
                break;
            }
        }

        System.out.println(s.size());
        s.forEach(r -> System.out.print(r + " "));
    }
}
