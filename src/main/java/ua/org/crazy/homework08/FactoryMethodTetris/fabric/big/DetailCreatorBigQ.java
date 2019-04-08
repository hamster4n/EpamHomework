package ua.org.crazy.homework08.FactoryMethodTetris.fabric.big;

import ua.org.crazy.homework08.FactoryMethodTetris.detail.Detail;
import ua.org.crazy.homework08.FactoryMethodTetris.detail.big.BigDetailL;
import ua.org.crazy.homework08.FactoryMethodTetris.detail.big.BigDetailQ;
import ua.org.crazy.homework08.FactoryMethodTetris.fabric.DetailCreator;

public class DetailCreatorBigQ implements DetailCreator {
    @Override
    public Detail createDetail() {
        return new BigDetailQ();
    }
}
