package com.zhanhonglai.handler;

import com.zhanhonglai.Rover;
import com.zhanhonglai.direction.RoverDirection;
import com.zhanhonglai.position.RoverPosition;

public class RoverHandler {
    private Rover rover;

    public void setRover(Rover rover) {
        this.rover = rover;
    }

    public Rover getRover() {
        return rover;
    }

    public void initialPosition(String positionString) {
        String[] positions = positionString.split(" ");
        if (positions.length>1){
            rover.setPosition(new RoverPosition(Integer.parseInt(positions[0]),Integer.parseInt(positions[1])));
        }
        else rover.setPosition(new RoverPosition(0,0));
    }

    public void initialDirection(String directionString) {
        rover.setRoverDirection(RoverDirection.valueOf(directionString));
    }
}
