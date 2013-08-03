package com.zhanhonglai.command;

import com.zhanhonglai.Rover;
import com.zhanhonglai.position.RoverPosition;

public class CommandCenter {
    public void move(RoverPosition position, String direction) {
        position.moveAt(direction);
    }

    public void turnRight(Rover rover) {
        String direction = rover.getDirection();
        if (direction.equalsIgnoreCase("NORTH")) {
            rover.setDirection("EAST");
        } else if (direction.equalsIgnoreCase("EAST")) {
            rover.setDirection("SOUTH");
        } else if (direction.equalsIgnoreCase("SOUTH")) {
            rover.setDirection("WEST");
        } else if (direction.equalsIgnoreCase("WEST")) {
           rover.setDirection("NORTH");
        }
    }
}
