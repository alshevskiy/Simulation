package com.alshevskiy.entities;

public class Herbivore extends Creature {
//    private final String emodji = "\uD83D\uDC11";
    public Herbivore(int speed, int hp) {
        super("\uD83D\uDC11", speed, hp);
    }

    @Override
    public void makeMove() {
    }
}
