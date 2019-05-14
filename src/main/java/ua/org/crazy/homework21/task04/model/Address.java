package ua.org.crazy.homework21.task04.model;

public class Address {
    private String country;
    private String city;
    private String street;

    public Address(String country, String city, String street) {
        this.country = country;
        this.city = city;
        this.street = street;
    }

    @Override
    public String toString() {
        return "" + country + ", " + city + ", " + street;
    }
}
