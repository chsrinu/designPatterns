package creational.abstractfactory.contracts;

import creational.abstractfactory.contracts.Animal;

public interface Mammal extends Animal {
    String walk();
    String feed();
}
