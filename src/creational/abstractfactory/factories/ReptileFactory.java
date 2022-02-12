package creational.abstractfactory.factories;

import creational.abstractfactory.contracts.Animal;
import creational.abstractfactory.utils.AnimalType;
import creational.abstractfactory.impl.Crocodile;
import creational.abstractfactory.impl.Snake;

public class ReptileFactory implements AnimalFactory {

    @Override
    public Animal createAnimal(String type) {
        switch(AnimalType.valueOf(type)){
            case SNAKE: return new Snake();
            case CROCODILE: return new Crocodile();
        }
        return null;
    }
}
