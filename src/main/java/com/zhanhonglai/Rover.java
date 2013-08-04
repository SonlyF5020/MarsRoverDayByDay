package com.zhanhonglai;

import com.zhanhonglai.command.CommandCenter;
import com.zhanhonglai.position.RoverPosition;

public class Rover {
    private String direction;
    private RoverPosition position;
    private CommandCenter commandCenter = new CommandCenter();

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public void turnLeft() {
        if (direction.equalsIgnoreCase("EAST")) {
            direction = "NORTH";
        } else if (direction.equalsIgnoreCase("NORTH")) {
            direction = "WEST";
        } else if (direction.equalsIgnoreCase("WEST")) {
            direction = "SOUTH";
        } else if (direction.equalsIgnoreCase("SOUTH")) {
            direction = "EAST";
        }
    }

    public void turnRight() {
        commandCenter.turnRight(this);
    }

    public void setPosition(RoverPosition position) {
        this.position = position;
    }

    public RoverPosition getPosition() {
        return position;
    }

    public void move() {
        commandCenter.move(this);
    }
}
