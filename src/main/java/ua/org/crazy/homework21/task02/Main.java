package ua.org.crazy.homework21.task02;

import ua.org.crazy.homework21.task02.util.Reader;
import ua.org.crazy.homework21.task02.util.Writer;

import java.util.List;

public class Main {
    private static final String INPUT_FILE =
            "src/main/java/ua/org/crazy/homework21/task02/file/servlet_start.txt";
    private static final String OUTPUT_FILE =
            "src/main/java/ua/org/crazy/homework21/task02/file/servlet_finish.txt";

    public static void main(String[] args) {
        List<Character> readFromFile = Reader.readTxtFileToListChars(INPUT_FILE);
        boolean isWriten = Writer.writeListCharsInReverceOrderToTxtFile(OUTPUT_FILE, readFromFile);
        System.out.println(isWriten);
    }
}
