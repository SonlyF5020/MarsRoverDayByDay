package com.zhanhonglai;

import com.zhanhonglai.command.CommandCenter;
import com.zhanhonglai.direction.RoverDirection;
import com.zhanhonglai.position.RoverPosition;

public class Rover {
    private String direction;
    private RoverPosition position;
    private CommandCenter commandCenter = new CommandCenter();
    private RoverDirection roverDirection;

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public void turnLeft() {
        commandCenter.turnLeft(this);
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
