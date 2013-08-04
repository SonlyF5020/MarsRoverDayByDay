package com.zhanhonglai.direction;

public enum RoverDirection {
    NORTH("N"), EAST("E"), WEST("W"), SOUTH("S");
    private final String directionChar;

    RoverDirection(String directionChar) {
        this.directionChar = directionChar;
    }

    public RoverDirection leftDirection() {
        if (this.equals(EAST)) return NORTH;
        if (this.equals(NORTH)) return WEST;
        if (this.equals(WEST)) return SOUTH;
        if (this.equals(SOUTH)) return EAST;
        return null;
    }

    public RoverDirection rightDirection() {
        if (this.equals(WEST)) return NORTH;
        if (this.equals(NORTH)) return EAST;
        if (this.equals(EAST)) return SOUTH;
        if (this.equals(SOUTH)) return WEST;
        return null;
    }
}
