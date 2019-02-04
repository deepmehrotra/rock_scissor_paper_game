package com.rps.game.rpsgame.service;

import java.util.Random;

public class Computer {
    // This function helps the computer do the selection among ROCK,
    // PAPER,SCISSORS
    // we have used Random class from java.util.
    public int getInput() {
        Random random = new Random();
        int input = random.nextInt(3) + 1;
        return input;
    }
}
