package com.alshevskiy.entities;

public abstract class Creature extends Entity {
    private int speed;
    private int hp;

    public Creature(String emoji, int speed, int hp) {
        super(emoji);
        this.speed = speed;
        this.hp = hp;
    }

    public abstract void makeMove();
}
