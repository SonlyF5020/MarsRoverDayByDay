package com.zhanhonglai.command;

import com.zhanhonglai.position.RoverPosition;

public class CommandCenter {
    public void move(RoverPosition position, String direction) {
        position.moveAt(direction);
    }
}
