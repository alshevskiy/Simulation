package com.alshevskiy.entities;

import com.alshevskiy.entities.Creature;

public class Predator extends Creature {
//    private final String emoji = "\uD83D\uDC3A";
    private final int attackPower = 10;

    public Predator(int speed, int hp) {
        super("\uD83D\uDC3A", speed, hp);
    }

    @Override
    public void makeMove() {
    }
}
