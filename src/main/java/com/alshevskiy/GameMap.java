package com.alshevskiy;

import com.alshevskiy.entities.Entity;

import java.util.HashMap;
import java.util.Map;

public class GameMap {
    private Map<Coordinates, Entity> map = new HashMap<>();

    public Map<Coordinates, Entity> getMap() {
        return map;
    }


}
