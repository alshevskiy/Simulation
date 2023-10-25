package com.alshevskiy;

public class Simulation {
    private final GameMap map;
    private final Renderer renderer;
    private int turnCounter = 0;
//    private boolean simulationIsStarted;

    public Simulation() {
        this.map = new GameMap();
        this.renderer = new Renderer();
    }

    public void nextTurn() {

    }

    public void startSimulation() {
//        simulationIsStarted = true;
    }

    public void pauseSimulation() {
//        simulationIsStarted = false;
    }


}
