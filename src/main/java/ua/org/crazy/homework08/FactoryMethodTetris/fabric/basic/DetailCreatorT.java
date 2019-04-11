package ua.org.crazy.homework08.FactoryMethodTetris.fabric.basic;

import ua.org.crazy.homework08.FactoryMethodTetris.detail.Detail;
import ua.org.crazy.homework08.FactoryMethodTetris.detail.basic.DetailS;
import ua.org.crazy.homework08.FactoryMethodTetris.detail.basic.DetailT;
import ua.org.crazy.homework08.FactoryMethodTetris.fabric.DetailCreator;

public class DetailCreatorT implements DetailCreator {
    @Override
    public Detail createDetail() {
        return new DetailT();
    }
}
