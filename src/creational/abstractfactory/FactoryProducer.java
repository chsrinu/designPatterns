package creational.abstractfactory;

import creational.abstractfactory.factories.AnimalFactory;
import creational.abstractfactory.factories.MammalFactory;
import creational.abstractfactory.factories.ReptileFactory;
import creational.abstractfactory.utils.AnimalType;

public class FactoryProducer {
    public static AnimalFactory createFactory(String type){
        switch(AnimalType.valueOf(type)){
            case HUMAN:
            case COW:
                return new MammalFactory();
            case SNAKE:
            case CROCODILE:
                return new ReptileFactory();
        }
        return null;
    }
}
