package ua.org.crazy.homework21.task04.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public final class Reader {

    private Reader() {
    }

    static String readFileInString(String fileName) throws IOException {
        return Files.lines(Paths.get(fileName))
                .map(line -> line + " ")
                .reduce("", String::concat)
                .trim();
    }

    public static String openFile(String fileName) {
        String file = "";
        try {
            file = readFileInString(fileName);
        } catch (IOException e) {
            System.out.println("IOException when read json file! " + e);
        }
        return file;
    }
}
