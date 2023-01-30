package JetBrains_tasks;

import java.io.ByteArrayOutputStream;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OutputStream {
    public static void main(String[] args) {
        String [] str = new String []{"This", " ", "is", " ", "a", " ", "test"};
        try {
            System.out.println(Arrays.toString(Converter.convert(str)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Converter {
    public static char[] convert(String[] words) throws IOException {

        CharArrayWriter contactWriter = new CharArrayWriter();
     contactWriter.write(String.valueOf(words));
     char [] array = contactWriter.toCharArray();
     contactWriter.close();
     return array;
    }
}