package com.zhanhonglai.main;

import com.zhanhonglai.handler.RoverHandler;
import com.zhanhonglai.rover.Rover;

public class Main {
    private static Rover rover = new Rover();
    private static RoverHandler roverHandler = new RoverHandler();

    public static void main(String[] args){
        roverHandler.setRover(rover);
        roverHandler.run();
    }
}
