package com.zhanhonglai.handler;

import com.zhanhonglai.rover.Rover;
import com.zhanhonglai.direction.RoverDirection;
import com.zhanhonglai.position.RoverPosition;

import java.util.Scanner;

public class RoverHandler {
    private Rover rover;

    public void setRover(Rover rover) {
        this.rover = rover;
    }

    public Rover getRover() {
        return rover;
    }

    public void initialPosition(String positionString) {
        String[] positions = positionString.split(" ");
        if (positions.length > 1) {
            rover.setPosition(new RoverPosition(Integer.parseInt(positions[0]), Integer.parseInt(positions[1])));
        } else rover.setPosition(new RoverPosition(0, 0));
    }

    public void initialDirection(String directionString) {
        rover.setDirection(RoverDirection.valueOf(directionString));
    }

    public void handleCommands(String commands) {
        for (int i = 0; i < commands.length(); i++) {
            Character command = commands.charAt(i);
            if (command.equals('M')) rover.move();
            else if (command.equals('L')) rover.turnRoverLeft();
            else if (command.equals('R')) rover.turnRoverRight();
            else System.out.println("unknow command");
        }
    }

    public void run() {
        runInitialPosition();
        runInitialDirection();
        runHandleCommands();
        rover.showDetailInfo();
    }

    private void runHandleCommands() {
        System.out.print("Rover's commands:");
        Scanner scanner2 = new Scanner(System.in);
        String commands = scanner2.nextLine();
        handleCommands(commands);
    }

    private void runInitialDirection() {
        System.out.print("Rover initial direction:");
        Scanner scanner1 = new Scanner(System.in);
        String directionString = scanner1.nextLine();
        initialDirection(directionString);
    }

    private void runInitialPosition() {
        System.out.print("Rover initial position:");
        Scanner scanner = new Scanner(System.in);
        String positionString = scanner.nextLine();
        initialPosition(positionString);
    }
}
