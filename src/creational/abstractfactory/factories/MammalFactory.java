package creational.abstractfactory.factories;

import creational.abstractfactory.contracts.Animal;
import creational.abstractfactory.utils.AnimalType;
import creational.abstractfactory.impl.Cow;
import creational.abstractfactory.impl.Human;

public class MammalFactory implements AnimalFactory {
    @Override
    public Animal createAnimal(String type) {
        switch(AnimalType.valueOf(type)){
            case HUMAN: return new Human();
            case COW: return new Cow();
        }
        return null;
    }
}
