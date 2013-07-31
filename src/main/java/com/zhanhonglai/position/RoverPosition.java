package com.zhanhonglai.position;

public class RoverPosition {
    private Integer xPosition;
    private Integer yPosition;

    public RoverPosition(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public Integer getYPosition() {
        return yPosition;
    }

    public Integer getXPosition() {
        return xPosition;
    }
}
