package ua.org.crazy.homework05.utils;

import ua.org.crazy.homework05.Entity.SpaceObject;
import ua.org.crazy.homework05.Entity.StarSystem;

import java.util.ArrayList;

public class Utils {
    public static void starSystemToString(StarSystem system){
        System.out.println("StarSystem: id=" + system.getId() + ", name=" + system.getName());
        System.out.println("[ SpaceObjects:");
        listSpaceObjectsToString(system.getSpaceObjects());
        System.out.println("]");
    }

    public static void listSpaceObjectsToString(ArrayList<SpaceObject> list){
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            result += "" + list.get(i) + "\n";
        }
        System.out.println(result);
    }
}
