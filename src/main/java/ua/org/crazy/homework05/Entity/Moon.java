package ua.org.crazy.homework05.Entity;

import java.util.Objects;

public class Moon extends SpaceObject {
    private String moonOwner;

    public Moon(Long id, String name, String moonOwner) {
        super(id, name);
        this.moonOwner = moonOwner;
    }

    public String getMoonOwner() {
        return moonOwner;
    }

    public void setMoonOwner(String moonOwner) {
        this.moonOwner = moonOwner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Moon moon = (Moon) o;
        return Objects.equals(moonOwner, moon.moonOwner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), moonOwner);
    }

    @Override
    public String toString() {
        return super.toString() + "Moon:" +
                "moonOwner='" + moonOwner;
    }
}
