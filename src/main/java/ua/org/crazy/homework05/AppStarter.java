package ua.org.crazy.homework05;

import ua.org.crazy.homework05.Entity.Moon;
import ua.org.crazy.homework05.Entity.Planet;
import ua.org.crazy.homework05.Entity.SpaceObject;
import ua.org.crazy.homework05.Entity.Star;
import ua.org.crazy.homework05.Entity.StarSystem;
import ua.org.crazy.homework05.repository.SpaceObjectRepository;
import ua.org.crazy.homework05.service.SpaceObjectService;
import ua.org.crazy.homework05.ui.ConsoleUi;

public class AppStarter {
    public static void main(String[] args) {
        StarSystem solar = new StarSystem(731L, "SolarSystem");
        SpaceObject star = new Star(1L, "Solar", "G4");
        solar.getSpaceObjects().add(star);
        SpaceObject planet1 = new Planet(5L, "Venus", 4, false);
        solar.getSpaceObjects().add(planet1);
        SpaceObject planet2 = new Planet(9L, "Earth", 6, true);
        SpaceObject moon1 = new Moon(97L, "Moon", "Earth");
        solar.getSpaceObjects().add(planet2);
        solar.getSpaceObjects().add(moon1);

        SpaceObjectRepository spaceObjectRepository = new SpaceObjectRepository(solar.getSpaceObjects());
        SpaceObjectService spaceObjectService = new SpaceObjectService(spaceObjectRepository);
        ConsoleUi consoleUi = new ConsoleUi(spaceObjectService, solar);

        consoleUi.run();
    }
}
