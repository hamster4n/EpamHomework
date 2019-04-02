package ua.org.crazy.homework05.ui;

import ua.org.crazy.homework05.Entity.Planet;
import ua.org.crazy.homework05.Entity.StarSystem;
import ua.org.crazy.homework05.service.SpaceObjectService;
import ua.org.crazy.homework05.utils.Utils;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleUi {
    private SpaceObjectService spaceObjectService;
    private StarSystem starSystem;
    private Scanner scanner;

    public ConsoleUi(SpaceObjectService spaceObjectService, StarSystem starSystem) {
        this.spaceObjectService = spaceObjectService;
        this.starSystem = starSystem;
        this.scanner = new Scanner(System.in);
    }

    public void run(){
        while (true){
            init();
        }
    }

    private void init() {
        helloMessage();
        String choice = getChoiceOneChar();
        switch (choice){
            case "n": {
                runMethodGetNumbersOfPlanet();
                break;
            }
            case "s":{
                runMethodGetStarName();
                break;
            }
            case "a":{
                runMethodAddNewPlanetToSystem();
                break;
            }
            case "p":{
                runMethodPrintSystem();
                break;
            }
            case "x":{
                System.out.println("Thank you for using the program. Goodbye.");
                System.exit(0);
            }
            default:{
                System.out.println("You input wrong choice!");
            }
        }
    }

    private void runMethodPrintSystem() {
        Utils.starSystemToString(starSystem);
    }

    private int getChoiceOneInt() {
        return scanner.nextInt();
    }

    private String getChoiceOneWord() {
        return scanner.next();
    }

    private void runMethodAddNewPlanetToSystem() {
        System.out.println("Input planetId: ");
        Long planetId = Long.valueOf(getChoiceOneInt());
        System.out.println("Input planetName: ");
        String planetName = getChoiceOneWord();
        spaceObjectService.addPlanetToSystem(new Planet(planetId, planetName));
        System.out.println("Planet was successfully added!");
    }

    private void runMethodGetStarName() {
        String starName = spaceObjectService.getStar().getName();
        System.out.println("StarName = " + starName);
    }

    private void runMethodGetNumbersOfPlanet() {
        ArrayList<Planet> planets = spaceObjectService.getAllPlanet();
        System.out.println("In the current star system " + planets.size() + " planets");
    }

    private String getChoiceOneChar() {
        return String.valueOf(scanner.next().trim().charAt(0));
    }
    private void helloMessage() {
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Please input char to choose function.");
        System.out.println("n - get the number of planets");
        System.out.println("s - get name of star");
        System.out.println("a - add new planet to system");
        System.out.println("p - print system");
        System.out.println("x - exit");
    }


}
