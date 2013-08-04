package com.zhanhonglai.command;

import com.zhanhonglai.Rover;
import com.zhanhonglai.position.RoverPosition;

public class CommandCenter {
    public void move(Rover rover) {
        rover.getPosition().moveAt(rover.getDirection());
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

    public void turnLeft(Rover rover) {
        String direction = rover.getDirection();
        if (direction.equalsIgnoreCase("EAST")) {
            rover.setDirection("NORTH");
        } else if (direction.equalsIgnoreCase("NORTH")) {
            rover.setDirection("WEST");
        } else if (direction.equalsIgnoreCase("WEST")) {
            rover.setDirection("SOUTH");
        } else if (direction.equalsIgnoreCase("SOUTH")) {
            rover.setDirection("EAST");
        }
    }
}
