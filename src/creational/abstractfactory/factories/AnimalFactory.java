package creational.abstractfactory.factories;

import creational.abstractfactory.contracts.Animal;
import creational.abstractfactory.utils.AnimalType;

public interface AnimalFactory {
    Animal createAnimal(String type);
}
