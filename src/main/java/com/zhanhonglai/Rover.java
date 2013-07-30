package com.zhanhonglai;

public class Rover {
    private String direction;
    private Integer yPosition;
    private Integer xPosition;

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
        if (direction.equalsIgnoreCase("NORTH")) {
            direction = "EAST";
        } else if (direction.equalsIgnoreCase("EAST")) {
            direction = "SOUTH";
        } else if (direction.equalsIgnoreCase("SOUTH")) {
            direction = "WEST";
        } else if (direction.equalsIgnoreCase("WEST")) {
            direction = "NORTH";
        }
    }

    public void setPosition(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public Integer getYPosition() {
        return yPosition;
    }

    public Integer getXPosition() {
        return xPosition;
    }

    public void move() {
        if (direction.equalsIgnoreCase("EAST")){
             xPosition++;
        }
    }
}
