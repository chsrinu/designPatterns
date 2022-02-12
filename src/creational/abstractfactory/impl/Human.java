package creational.abstractfactory.impl;

import creational.abstractfactory.contracts.Mammal;

public class Human implements Mammal {
    @Override
    public String getName() {
        return "Human";
    }

    @Override
    public String lifetime() {
        return "100Yrs";
    }

    @Override
    public String walk() {
        return String.format("%s can walk as per his capacity",getName());
    }

    @Override
    public String feed() {
        return String.format("%s can feed only after giving birth",getName());
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %s - %s",getName(),lifetime(),walk(),feed());
    }
}
