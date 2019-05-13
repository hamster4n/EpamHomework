package ua.org.crazy.homework19.task02;

import java.time.LocalDate;

public class User {
    private String name;
    private String surname;
    private Address address;
    private LocalDate birthday;
    private int index;
    private Sex sex;

    public User(String name, String surname, Address address, LocalDate birthday, int index, Sex sex) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.birthday = birthday;
        this.index = index;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return index == user.index &&
                name.equals(user.name) &&
                surname.equals(user.surname) &&
                address.equals(user.address) &&
                birthday.equals(user.birthday) &&
                sex == user.sex;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((surname == null) ? 0 : surname.hashCode());
        result = prime * result + address.hashCode();
        result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
        result = prime * result + index;
        result = prime * result + ((sex == null) ? 0 : sex.getHashCode());
        return result;
    }
}
