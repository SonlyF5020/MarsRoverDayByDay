package com.zhanhonglai.rover;

import com.zhanhonglai.command.CommandCenter;
import com.zhanhonglai.direction.RoverDirection;
import com.zhanhonglai.position.RoverPosition;

public class Rover {
    private RoverPosition position;
    private CommandCenter commandCenter = new CommandCenter();
    private RoverDirection direction;

    public void setPosition(RoverPosition position) {
        this.position = position;
    }

    public RoverPosition getPosition() {
        return position;
    }

    public void setDirection(RoverDirection direction) {
        this.direction = direction;
    }

    public RoverDirection getDirection() {
        return direction;
    }

    public void turnRoverLeft() {
        commandCenter.turnLeft(this);
    }

    public void turnRoverRight() {
        commandCenter.turnRight(this);
    }

    public void move() {
        commandCenter.moveAhead(this);
    }

    public void showDetailInfo() {
        System.out.print("Rover's Position: ");
        position.showDetail();
        System.out.print("Rover's Direction: ");
        direction.showDetail();
    }
}
