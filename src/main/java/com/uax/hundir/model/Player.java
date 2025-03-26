package com.uax.hundir.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player {
    private String name;
    private List<Ship> ships;
    private Random random;

    public Player(String name) {
        this.name = name;
        ships = new ArrayList<>();
        random = new Random();
    }

    public String getName() {
        return name;
    }

    public void addShip(Ship ship) {
        if (ships.size() < 3) {
            ships.add(ship);
        } else {
            System.out.println("Máximo 3 barcos permitidos.");
        }
    }

    public List<Ship> getShips() {
        return ships;
    }

    public boolean allShipsSunk() {
        for (Ship ship : ships) {
            if (!ship.isSunk()) {
                return false;
            }
        }
        return true;
    }

    // Simula un ataque: selecciona aleatoriamente uno de los barcos del oponente que no esté hundido y ataca una posición aleatoria
    public void attack(Player opponent) {
        List<Ship> targetShips = new ArrayList<>();
        for (Ship ship : opponent.getShips()) {
            if (!ship.isSunk()) {
                targetShips.add(ship);
            }
        }
        if (targetShips.isEmpty()) return;
        Ship target = targetShips.get(random.nextInt(targetShips.size()));
        int position = random.nextInt(target.getSize());
        target.hit(position);
        System.out.println(name + " ataca a " + opponent.getName() + " en el barco " + target.getName() + " (posición " + position + ")");
        if (target.isSunk()) {
            System.out.println(target.getName() + " (" + target.getType() + ") ha sido hundido!");
        }
    }
}
