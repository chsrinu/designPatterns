package creational.abstractfactory.impl;

import creational.abstractfactory.contracts.Mammal;

public class Cow implements Mammal {

    @Override
    public String getName() {
        return "Cow";
    }

    @Override
    public String lifetime() {
        return "20 Yrs";
    }

    @Override
    public String walk() {
        return String.format("%s, can walk till its capacity",getName());
    }

    @Override
    public String feed() {
        return String.format("%s, can feed anytime anywhere", getName());
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %s - %s",getName(),lifetime(),walk(),feed());
    }
}
