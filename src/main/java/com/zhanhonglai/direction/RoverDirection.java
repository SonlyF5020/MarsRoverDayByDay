package com.zhanhonglai.direction;
public enum RoverDirection {
    NORTH("N"), EAST("E"), WEST("W");
    private final String directionChar;

    RoverDirection(String directionChar) {
        this.directionChar = directionChar;
    }

    public RoverDirection turnLeft() {
        if (this.equals(EAST)){
           return NORTH;
        }
        return null;
    }
}
