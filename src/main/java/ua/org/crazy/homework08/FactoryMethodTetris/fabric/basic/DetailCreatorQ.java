package ua.org.crazy.homework08.FactoryMethodTetris.fabric.basic;

import ua.org.crazy.homework08.FactoryMethodTetris.detail.Detail;
import ua.org.crazy.homework08.FactoryMethodTetris.detail.basic.DetailL;
import ua.org.crazy.homework08.FactoryMethodTetris.detail.basic.DetailQ;
import ua.org.crazy.homework08.FactoryMethodTetris.fabric.DetailCreator;

public class DetailCreatorQ implements DetailCreator {
    @Override
    public Detail createDetail() {
        return new DetailQ();
    }
}
