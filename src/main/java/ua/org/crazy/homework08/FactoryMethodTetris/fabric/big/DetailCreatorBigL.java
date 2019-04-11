package ua.org.crazy.homework08.FactoryMethodTetris.fabric.big;

import ua.org.crazy.homework08.FactoryMethodTetris.detail.Detail;
import ua.org.crazy.homework08.FactoryMethodTetris.detail.big.BigDetailJ;
import ua.org.crazy.homework08.FactoryMethodTetris.detail.big.BigDetailL;
import ua.org.crazy.homework08.FactoryMethodTetris.fabric.DetailCreator;

public class DetailCreatorBigL implements DetailCreator {
    @Override
    public Detail createDetail() {
        return new BigDetailL();
    }
}
