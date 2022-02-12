package creational.abstractfactory.impl;

import creational.abstractfactory.contracts.Reptile;

public class Snake implements Reptile {
    @Override
    public String getName() {
        return "Snake";
    }

    @Override
    public String lifetime() {
        return "8 Yrs";
    }

    @Override
    public String crawl() {
        return String.format("%s, can crawl any longer",getName());
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %s",getName(),lifetime(),crawl());
    }
}
