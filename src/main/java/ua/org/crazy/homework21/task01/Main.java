package ua.org.crazy.homework21.task01;

import ua.org.crazy.homework21.task01.model.Address;
import ua.org.crazy.homework21.task01.model.Sex;
import ua.org.crazy.homework21.task01.model.User;
import ua.org.crazy.homework21.task01.serial.Serializator;

import java.io.InvalidObjectException;
import java.time.LocalDate;

public class Main {
    private static final String fileName = "src/main/java/ua/org/crazy/homework21/task01/file/txt.txt";

    public static void main(String[] args) {
        Address address = new Address("Kiev", 12312);
        LocalDate birthday = LocalDate.of(1970, 5, 13);
        User user = new User("Ivan", "Ivanov", Sex.MALE, address, birthday);
        System.out.println("Original user: ");
        System.out.println(user);

        Serializator serializator = new Serializator();
        boolean isSerialize = serializator.serialization(user, fileName);
        System.out.println("User serialized: " + isSerialize);

        User userDeserialized = null;
        try {
            userDeserialized = serializator.deserialization(fileName);
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }

        System.out.println("Deserialized user: ");
        System.out.println(userDeserialized);
    }
}
