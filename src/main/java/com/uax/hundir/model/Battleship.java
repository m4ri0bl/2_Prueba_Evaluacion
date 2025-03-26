
package com.uax.hundir.model;

public class Battleship extends Ship {

    // Atributo adicional para controlar los contenedores aislados
    private boolean[] containerHit;

    public Battleship(String name) {
        super(name, 5);
        containerHit = new boolean[5];
    }

    @Override
    public void hit(int position) {
        super.hit(position);
        if (position >= 0 && position < containerHit.length) {
            containerHit[position] = true;
        }
    }

    @Override
    public boolean isSunk() {
        // El acorazado se considera hundido solo si se han impactado todas las posiciones aisladas
        for (int i = 0; i < size; i++) {
            if (!containerHit[i]) return false;
        }
        return true;
    }

    @Override
    public String getType() {
        return "Battleship";
    }
}
