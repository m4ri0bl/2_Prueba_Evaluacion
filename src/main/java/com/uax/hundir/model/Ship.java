package com.uax.hundir.model;

public abstract class Ship {
    protected String name;
    protected int size;
    protected boolean[] hits;

    public Ship(String name, int size) {
        this.name = name;
        this.size = size;
        this.hits = new boolean[size];
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    // Registra un impacto en la posición indicada (0-indexado)
    public void hit(int position) {
        if (position >= 0 && position < size) {
            hits[position] = true;
        }
    }

    // Devuelve true si todas las posiciones han sido impactadas
    public boolean isSunk() {
        for (boolean hit : hits) {
            if (!hit) return false;
        }
        return true;
    }

    public abstract String getType();
}
