package com.alshevskiy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Simulation simulation = new Simulation();

        Scanner scanner = new Scanner(System.in);

        // command 1 - Start simulation
        // command 2 - Pause simulation
        // command 3 - Do next turn

        System.out.print("Enter number of command: ");
        int numberOfCommand = scanner.nextInt();
        System.out.println(validateNumberOfCommand(numberOfCommand));

        switch (numberOfCommand) {
            case (1):
                simulation.startSimulation();
                break;
            case (2):
                simulation.pauseSimulation();
                break;
            case (3):
                simulation.nextTurn();
                break;
        }

    }

    private static String validateNumberOfCommand(int numberOfCommand) {
        String message = "OK";
        String line = Integer.toString(numberOfCommand);
        if (line.isEmpty()) {
            message = "Empty input. Try again";
        }
        if (line.charAt(0) < 49 || line.charAt(0) > 51) {
            message = "The symbol is not valid. Try again";
        }
        return message;
    }
}
