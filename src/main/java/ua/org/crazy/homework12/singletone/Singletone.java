package ua.org.crazy.homework12.singletone;

public class Singletone {

    private static Singletone instance = null;

    private Singletone() {
    }

    public static Singletone getInstance() {
        if (instance == null) {
            instance = new Singletone();
        }
        return instance;
    }


}
