package ua.org.crazy.homework21.task04.util;


import com.google.gson.Gson;
import ua.org.crazy.homework21.task04.model.User;

public final class GsonParser {
    private GsonParser() {
    }

    public static User parse(String jsonString) {
        Gson gson = new Gson();
        return gson.fromJson(jsonString, User.class);
    }
}
