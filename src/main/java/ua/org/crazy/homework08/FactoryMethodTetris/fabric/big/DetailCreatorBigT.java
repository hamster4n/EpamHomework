package ua.org.crazy.homework08.FactoryMethodTetris.fabric.big;

import ua.org.crazy.homework08.FactoryMethodTetris.detail.Detail;
import ua.org.crazy.homework08.FactoryMethodTetris.detail.big.BigDetailS;
import ua.org.crazy.homework08.FactoryMethodTetris.detail.big.BigDetailT;
import ua.org.crazy.homework08.FactoryMethodTetris.fabric.DetailCreator;

public class DetailCreatorBigT implements DetailCreator {
    @Override
    public Detail createDetail() {
        return new BigDetailT();
    }
}
