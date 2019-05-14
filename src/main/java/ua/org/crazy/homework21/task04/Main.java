package ua.org.crazy.homework21.task04;

import ua.org.crazy.homework21.task04.model.User;
import ua.org.crazy.homework21.task04.util.GsonParser;
import ua.org.crazy.homework21.task04.util.Reader;

public class Main {
    private static final String FILE_NAME = "src/main/java/ua/org/crazy/homework21/task04/json.json";

    public static void main(String[] args) {
        String jsonString = Reader.openFile(FILE_NAME);
        User user = GsonParser.parse(jsonString);
        System.out.println(user);
    }
}
