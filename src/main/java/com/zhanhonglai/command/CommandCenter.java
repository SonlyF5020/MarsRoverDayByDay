package com.zhanhonglai.command;

import com.zhanhonglai.Rover;

public class CommandCenter {
    public void move(Rover rover) {
        rover.getPosition().moveAt(rover.getDirection());
    }

    public void turnRoverLeft(Rover rover) {
        rover.setRoverDirection(rover.getRoverDirection().leftDirection());
    }

    public void turnRoverRight(Rover rover) {
        rover.setRoverDirection(rover.getRoverDirection().rightDirection());
    }

    public void moveAhead(Rover rover) {
        rover.getPosition().moveAlong(rover.getRoverDirection());
    }
}
