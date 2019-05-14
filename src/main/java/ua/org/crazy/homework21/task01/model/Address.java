package ua.org.crazy.homework21.task01.model;

import java.io.Serializable;

public class Address implements Serializable {
    private String city;
    private int code;
    private static final long serialVersionUID = 1L;

    public Address(String city, int code) {
        this.city = city;
        this.code = code;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", code=" + code +
                '}';
    }
}
