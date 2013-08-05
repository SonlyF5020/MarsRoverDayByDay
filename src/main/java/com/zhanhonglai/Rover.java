package com.zhanhonglai;

import com.zhanhonglai.command.CommandCenter;
import com.zhanhonglai.direction.RoverDirection;
import com.zhanhonglai.position.RoverPosition;

public class Rover {
    private RoverPosition position;
    private CommandCenter commandCenter = new CommandCenter();
    private RoverDirection roverDirection;

    public void setPosition(RoverPosition position) {
        this.position = position;
    }

    public RoverPosition getPosition() {
        return position;
    }

    public void setRoverDirection(RoverDirection roverDirection) {
        this.roverDirection = roverDirection;
    }

    public RoverDirection getRoverDirection() {
        return roverDirection;
    }

    public void turnRoverLeft() {
        commandCenter.turnRoverLeft(this);
    }

    public void turnRoverRight() {
        commandCenter.turnRoverRight(this);
    }

    public void move() {
        commandCenter.moveAhead(this);
    }
}
