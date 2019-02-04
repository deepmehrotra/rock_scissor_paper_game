package com.rps.game.rpsgame.service;

public class GameHelper {
    public static final int ROCK = 1;
    public static final int PAPER = 2;
    public static final int SCISSORS = 3;

    public static void display(String player, int s) {
        switch (s) {
            case ROCK:
                System.out.print(player + " selected ROCK   ");
                break;
            case PAPER:
                System.out.print(player + " selected PAPER   ");
                break;
            case SCISSORS:
                System.out.print(player + " selected SCISSORS   ");
                break;
            default:
                break;
        }
    }

    public static int compareSelections(int userSelection, int computerSelection) {
        if(userSelection==computerSelection) return 0;
        switch (userSelection) {
            case ROCK:
                return (computerSelection == SCISSORS ? 1 : -1);

            case PAPER:
                return (computerSelection == ROCK ? 1 : -1);

            case SCISSORS:
                return (computerSelection == PAPER ? 1 : -1);
        }
        return 0;
    }


}
