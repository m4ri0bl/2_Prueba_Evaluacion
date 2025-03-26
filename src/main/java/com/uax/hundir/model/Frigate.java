package com.uax.hundir.model;

public class Frigate extends Ship {

    public Frigate(String name) {
        super(name, 3);
    }

    @Override
    public String getType() {
        return "Frigate";
    }
}
