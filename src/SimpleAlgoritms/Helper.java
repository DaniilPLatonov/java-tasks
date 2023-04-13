package SimpleAlgoritms;

import java.io.*;
import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;

public class Helper {

    public static long dateInEpochSecond(String text) {
        Instant instant = Instant.parse(text);
        return instant.getEpochSecond();
    }


    public static void main(String[] args) {
        copy("C:\\java-tasks\\file1.txt", "C:\\java-tasks\\file2.txt");

    }

    public static void copy(String records1, String records2){
        try{
            InputStream is = new FileInputStream(records1);
            OutputStream os = new FileOutputStream(records2);
            byte [] buffer = new byte[1024];
            int bytesRead = 0;
            while((bytesRead = is.read(buffer)) != -1){
                os.write(buffer, 0, bytesRead);
                System.out.println("Read and written bytes " + bytesRead);
            }
        }catch (FileNotFoundException | IndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
