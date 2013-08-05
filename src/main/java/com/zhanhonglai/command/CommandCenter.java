package com.zhanhonglai.command;

import com.zhanhonglai.Rover;

public class CommandCenter {
    public void turnLeft(Rover rover) {
        rover.setDirection(rover.getDirection().leftDirection());
    }

    public void turnRight(Rover rover) {
        rover.setDirection(rover.getDirection().rightDirection());
    }

    public void moveAhead(Rover rover) {
        rover.getPosition().moveAlong(rover.getDirection());
    }
}
