package com.uax.hundir.model;

public class Canoe extends Ship {

    public Canoe(String name) {
        super(name, 1);
    }

    @Override
    public String getType() {
        return "Canoe";
    }
}
