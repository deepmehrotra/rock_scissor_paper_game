package com.rps.game.rpsgame.service;

import java.util.Scanner;

public class InputManager {

    Scanner sc = new Scanner(System.in);

    public int getInputFromPalyer() {
        // This function lets the user do the selection among
        // ROCK PAPER SCISSORS
        // and return what has been selected
        System.out.println("Select  ROCK  PAPER SCISSOR");

        String input = sc.next();
        input = input.toUpperCase();
        char c = input.charAt(0);
        // checking the 1st character in the input
        if (c == 'R')
            return GameHelper.ROCK;
        else if (c == 'P')
            return GameHelper.PAPER;
        else if (c == 'S')
            return GameHelper.SCISSORS;
        else {
            getInputFromPalyer();
            return 0;
        }
    }

    public boolean playAgain() {
        // This function will ask if the user wants to
        // play again and return true or false accordingly.
        sc=new Scanner(System.in);
        System.out.print("Do you want to play again? ");
        String userInput = sc.nextLine();
        userInput = userInput.toUpperCase();
        return userInput.charAt(0) == 'Y';
    }

    public String askName() {
        System.out.println("Please enter your name");
        return sc.next();
    }
}
