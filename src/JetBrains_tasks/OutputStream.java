package JetBrains_tasks;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

interface Foo{ int x = 10;}

public class OutputStream {
    public static void main(String[] args) throws IOException {

    }
}

class Converter {
    public static char[] convert(String[] words) throws IOException {

        CharArrayWriter contactWriter = new CharArrayWriter();
        for (int i = 0; i < words.length; i++) {
            contactWriter.write(words[i]);
        }
        char[] array = contactWriter.toCharArray();
        contactWriter.close();
        return array;
    }
}