package ua.org.crazy.homework08.FactoryMethodTetris.fabric.basic;

import ua.org.crazy.homework08.FactoryMethodTetris.detail.Detail;
import ua.org.crazy.homework08.FactoryMethodTetris.detail.basic.DetailI;
import ua.org.crazy.homework08.FactoryMethodTetris.fabric.DetailCreator;

public class DetailCreatorI implements DetailCreator {
    @Override
    public Detail createDetail() {
        return new DetailI();
    }
}
