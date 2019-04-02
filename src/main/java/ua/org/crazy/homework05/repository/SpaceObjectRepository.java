package ua.org.crazy.homework05.repository;

import ua.org.crazy.homework05.Entity.Planet;
import ua.org.crazy.homework05.Entity.SpaceObject;
import ua.org.crazy.homework05.Entity.Star;

import java.util.ArrayList;

public class SpaceObjectRepository {
    private ArrayList<SpaceObject> spaceObjects;

    public SpaceObjectRepository(ArrayList<SpaceObject> spaceObjects) {
        this.spaceObjects = spaceObjects;
    }

    public ArrayList<Planet> getAllPlanet(){
        ArrayList<Planet> planets = new ArrayList<>();
        for (int i = 0; i < spaceObjects.size(); i++) {
            if (spaceObjects.get(i).getClass().equals(Planet.class)){
                planets.add((Planet) spaceObjects.get(i));
            }
        }
        return planets;
    }

    public void addPlanetToSystem(SpaceObject spaceObject){
        spaceObjects.add(spaceObject);
    }

    public Star getStar(){
        for (int i = 0; i < spaceObjects.size(); i++) {
            if(spaceObjects.get(i).getClass().equals(Star.class)){
                return (Star) spaceObjects.get(i);
            }
        }
        return null;
    }
}
