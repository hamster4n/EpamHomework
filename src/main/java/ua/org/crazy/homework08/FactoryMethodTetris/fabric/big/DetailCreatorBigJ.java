package ua.org.crazy.homework08.FactoryMethodTetris.fabric.big;

import ua.org.crazy.homework08.FactoryMethodTetris.detail.Detail;
import ua.org.crazy.homework08.FactoryMethodTetris.detail.big.BigDetailI;
import ua.org.crazy.homework08.FactoryMethodTetris.detail.big.BigDetailJ;
import ua.org.crazy.homework08.FactoryMethodTetris.fabric.DetailCreator;

public class DetailCreatorBigJ implements DetailCreator {
    @Override
    public Detail createDetail() {
        return new BigDetailJ();
    }
}
