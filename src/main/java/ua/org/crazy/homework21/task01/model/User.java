package ua.org.crazy.homework21.task01.model;

import java.io.Serializable;
import java.time.LocalDate;

public class User implements Serializable {
    private String name;
    private String surname;
    private Sex sex;
    private Address address;
    private LocalDate birthday;
    private static final long serialVersionUID = 1L;

    public User(String name, String surname, Sex sex, Address address, LocalDate birthday) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.address = address;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", sex=" + sex +
                ", address=" + address +
                ", birthday=" + birthday +
                '}';
    }
}
