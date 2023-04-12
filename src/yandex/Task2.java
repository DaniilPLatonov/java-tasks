package yandex;

import java.util.*;

import java.util.Scanner;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int count = 0;

        LinkedList<Long> slabs = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            long x = scanner.nextLong();
            while (!slabs.isEmpty() && slabs.getLast() <= x) {
                slabs.removeLast();
            }
            slabs.add(x);
        }

        ListIterator<Long> iter = slabs.listIterator();
        ListIterator<Long> iterNext = slabs.listIterator(1);
        while (iterNext.hasNext()) {
            long diff = iter.next() - iterNext.next();
            iter.set(diff);
        }
        slabs.sort(null);

        TreeSet<Long> volunteers = new TreeSet<>();
        for (int i = 0; i < m; i++) {
            long x = scanner.nextLong();
            volunteers.add(x);
        }

        iter = slabs.listIterator();
        while (iter.hasNext()) {
            long slab = iter.next();
            Long volunteer = volunteers.ceiling(slab);
            if (volunteer != null) {
                volunteers.remove(volunteer);
                count++;
            }
        }

        System.out.println(count);
    }
}
