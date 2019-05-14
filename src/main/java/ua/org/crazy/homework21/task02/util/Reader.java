package ua.org.crazy.homework21.task02.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class Reader {

    private Reader() {
    }

    public static List<Character> readTxtFileToListChars(String fileName) {
        List<Character> result = new ArrayList<>();
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(new File(fileName));
            int ch;
            while ((ch = fileReader.read()) != -1) {
                result.add((char) ch);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File " + fileName + "does not exist: " + e);
        } catch (IOException ioe) {
            System.err.println("Common I / O error: " + ioe);
        } finally {
            if (fileReader != null){
                try {
                    fileReader.close();
                } catch (IOException ioe) {
                    System.err.println("Common I / O error: " + ioe);
                }
            }
        }
        return result;
    }

}
