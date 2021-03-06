package ua.org.crazy.homework08.FactoryMethodTetris.fabric.basic;

import ua.org.crazy.homework08.FactoryMethodTetris.detail.Detail;
import ua.org.crazy.homework08.FactoryMethodTetris.detail.basic.DetailT;
import ua.org.crazy.homework08.FactoryMethodTetris.detail.basic.DetailZ;
import ua.org.crazy.homework08.FactoryMethodTetris.fabric.DetailCreator;

public class DetailCreatorZ implements DetailCreator {
    @Override
    public Detail createDetail() {
        return new DetailZ();
    }
}
