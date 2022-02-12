package creational.abstractfactory.impl;

import creational.abstractfactory.contracts.Reptile;

public class Crocodile implements Reptile {
    @Override
    public String getName() {
        return "Crocodile";
    }

    @Override
    public String lifetime() {
        return "15Yrs";
    }

    @Override
    public String crawl() {
        return String.format("%s, can crawl till the pond",getName());
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %s",getName(),lifetime(),crawl());
    }
}
