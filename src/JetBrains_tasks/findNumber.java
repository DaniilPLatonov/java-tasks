package JetBrains_tasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class findNumber {
    public static void main(String[] args) {
        String pathToFile = "..\\java-tasks\\dataset_91007 (1).txt";
        File file = new File(pathToFile);

        try (Scanner scanner = new Scanner(file)) {
            int max = 0 ;
            while (scanner.hasNext()) {
                Integer abc = scanner.nextInt();

                if(max < abc){
                    max = abc;
                }
            }
            System.out.println(max);
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + pathToFile);
        }
    }
}
