package com.alshevskiy;

import com.alshevskiy.entities.Entity;

import java.util.Map;

public class Renderer {

    public void coordinatesRenderer() {
        Coordinates[] arrayCoordinates = Coordinates.values();
        int counter = 0;

        for (Coordinates coordinates : arrayCoordinates) {
            if (counter == 10) {
                counter = 0;
                System.out.println();
            }

            System.out.print(coordinates.name());
            System.out.print(" ");
            counter++;
        }
    }

    public void mapRenderer(Map<Coordinates, Entity> map) {
        Coordinates[] arrayCoordinates = Coordinates.values();
        int counter = 0;
        for (Coordinates coordinates : arrayCoordinates) {
            if (counter == 10) {
                counter = 0;
                System.out.println();
            }

            Entity entity = map.get(coordinates);
                if (entity == null) {
                    System.out.print("\u20DE" + "  ");
                } else {
                    System.out.print(entity.getEmoji());
                }

            System.out.print(" ");
            counter++;
        }
    }
}
