package ua.org.crazy.homework08.FactoryMethodTetris.utils;

import ua.org.crazy.homework08.FactoryMethodTetris.fabric.DetailCreator;
import ua.org.crazy.homework08.FactoryMethodTetris.fabric.basic.DetailCreatorI;
import ua.org.crazy.homework08.FactoryMethodTetris.fabric.basic.DetailCreatorJ;
import ua.org.crazy.homework08.FactoryMethodTetris.fabric.basic.DetailCreatorL;
import ua.org.crazy.homework08.FactoryMethodTetris.fabric.basic.DetailCreatorQ;
import ua.org.crazy.homework08.FactoryMethodTetris.fabric.basic.DetailCreatorS;
import ua.org.crazy.homework08.FactoryMethodTetris.fabric.basic.DetailCreatorT;
import ua.org.crazy.homework08.FactoryMethodTetris.fabric.basic.DetailCreatorZ;
import ua.org.crazy.homework08.FactoryMethodTetris.fabric.big.DetailCreatorBigI;
import ua.org.crazy.homework08.FactoryMethodTetris.fabric.big.DetailCreatorBigJ;
import ua.org.crazy.homework08.FactoryMethodTetris.fabric.big.DetailCreatorBigL;
import ua.org.crazy.homework08.FactoryMethodTetris.fabric.big.DetailCreatorBigQ;
import ua.org.crazy.homework08.FactoryMethodTetris.fabric.big.DetailCreatorBigS;
import ua.org.crazy.homework08.FactoryMethodTetris.fabric.big.DetailCreatorBigT;
import ua.org.crazy.homework08.FactoryMethodTetris.fabric.big.DetailCreatorBigZ;

public class Utils {
    public static final String[] details = {"I", "J", "L", "Q", "S", "T", "Z"};

    public static String getOneRandomDetail() {
        int size = details.length;
        int rnd = (int) (Math.random() * size);
        return details[rnd];
    }

    public static Boolean isDetailBasic() {
        int rnd = (int) (Math.random() * 10);
        if (rnd < 8) {
            return true;
        } else {
            return false;
        }
    }

    public static DetailCreator getBasicCreator(String detail) {
        switch (detail) {
            case "I":
                return new DetailCreatorI();
            case "J":
                return new DetailCreatorJ();
            case "L":
                return new DetailCreatorL();
            case "Q":
                return new DetailCreatorQ();
            case "S":
                return new DetailCreatorS();
            case "T":
                return new DetailCreatorT();
            case "Z":
                return new DetailCreatorZ();
            default:
                return null;
        }
    }

    public static DetailCreator getBigCreator(String detail){
        switch (detail) {
            case "I":
                return new DetailCreatorBigI();
            case "J":
                return new DetailCreatorBigJ();
            case "L":
                return new DetailCreatorBigL();
            case "Q":
                return new DetailCreatorBigQ();
            case "S":
                return new DetailCreatorBigS();
            case "T":
                return new DetailCreatorBigT();
            case "Z":
                return new DetailCreatorBigZ();
            default:
                return null;
        }
    }

    public static DetailCreator callCreator(){
        boolean isDetailBasic = isDetailBasic();
        String rndDetail = getOneRandomDetail();
        if (isDetailBasic){
            return getBasicCreator(rndDetail);
        } else return getBigCreator(rndDetail);
    }

    public static void runOneIteration(){
        DetailCreator creator = callCreator();
        creator.createDetail().buidDetail();
    }

    public static void runManyIterations(int numberIterations){
        for (int i = 0; i < numberIterations; i++) {
            runOneIteration();
        }
    }
}
