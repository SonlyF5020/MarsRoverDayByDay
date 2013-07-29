package com.zhanhonglai;

public class Rover {
    private String direction;

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
}
