package ua.org.crazy.homework05.Entity;

import java.util.ArrayList;
import java.util.Objects;

public class StarSystem {
    private Long id;
    private String name;
    private ArrayList<SpaceObject> spaceObjects;

    public StarSystem() {
    }

    public StarSystem(Long id, String name) {
        this.id = id;
        this.name = name;
        this.spaceObjects = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<SpaceObject> getSpaceObjects() {
        return spaceObjects;
    }

    public void setSpaceObjects(ArrayList<SpaceObject> spaceObjects) {
        this.spaceObjects = spaceObjects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StarSystem that = (StarSystem) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "StarSystem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", \n   spaceObjects=" + spaceObjects +
                "\n}";
    }
}
