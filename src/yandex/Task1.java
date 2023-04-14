package yandex;

import java.util.*;

import java.util.Scanner;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numRows = scanner.nextInt();
        int numCols = scanner.nextInt();

        if (numRows <= 0 || numCols <= 0) {
            System.err.println("Invalid input: rows and columns must be positive integers.");
            return;
        }

        scanner.nextLine();
        String[] figure = new String[numRows];

        for (int i = 0; i < numRows; i++) {
            figure[i] = scanner.nextLine();

            if (figure[i].length() != numCols) {
                System.err.println("Invalid input");
                return;
            }
        }

        int numCommands = scanner.nextInt();

        for (int i = 0; i < numCommands; i++) {
            String name = scanner.next();
            int count = scanner.nextInt();
            char symbol = scanner.next().charAt(0);

            while (count-- > 0) {
                figure[numRows - 2] = figure[numRows - 2].replace(' ', symbol);
                numRows--;
            }
        }

        Arrays.stream(figure).forEach(System.out::println);
    }
}