package ua.org.crazy.homework21.task02.util;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public final class Writer {


    private Writer() {
    }

    public static boolean writeListCharsInReverceOrderToTxtFile(String fileName, List<Character> list){
        boolean dataWritedToFile = false;
        FileWriter writer = null;
        try {
            writer = new FileWriter(fileName);
            for (int i = list.size() -1 ; i >= 0; i--) {
                writer.write(list.get(i));
            }
            dataWritedToFile = true;
        } catch (IOException ioe) {
            System.err.println("Common I / O error: " + ioe);
        } finally {
            if (writer != null){
                try {
                    writer.close();
                } catch (IOException ioe) {
                    System.err.println("Common I / O error: " + ioe);
                }
            }
        }
        return dataWritedToFile;
    }
}
