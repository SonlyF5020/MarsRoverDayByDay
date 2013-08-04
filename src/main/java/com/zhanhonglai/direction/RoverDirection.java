package com.zhanhonglai.direction;
public enum RoverDirection {
    NORTH("N"), EAST("E"), WEST("W");
    private final String directionChar;

    RoverDirection(String directionChar) {
        this.directionChar = directionChar;
    }

    public RoverDirection leftDirection() {
        if (this.equals(EAST)){
           return NORTH;
        }
        if (this.equals(NORTH)){
            return WEST;
        }
        return null;
    }
}
