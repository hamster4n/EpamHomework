package ua.org.crazy.homework05.service;

import ua.org.crazy.homework05.Entity.Planet;
import ua.org.crazy.homework05.Entity.SpaceObject;
import ua.org.crazy.homework05.Entity.Star;
import ua.org.crazy.homework05.repository.SpaceObjectRepository;

import java.util.ArrayList;

public class SpaceObjectService {
    private SpaceObjectRepository spaceObjectRepository;

    public SpaceObjectService(SpaceObjectRepository spaceObjectRepository) {
        this.spaceObjectRepository = spaceObjectRepository;
    }

    public ArrayList<Planet> getAllPlanet() {
        return spaceObjectRepository.getAllPlanet();
    }

    public void addPlanetToSystem(SpaceObject spaceObject) {
        spaceObjectRepository.addPlanetToSystem(spaceObject);
    }

    public Star getStar() {
        return spaceObjectRepository.getStar();
    }
}
