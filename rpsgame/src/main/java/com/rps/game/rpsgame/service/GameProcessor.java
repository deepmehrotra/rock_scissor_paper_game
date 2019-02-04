package com.rps.game.rpsgame.service;

public class GameProcessor {

    private InputManager inputManager=null;
    private String name=null;
    private Computer computer=null;
    private int playerScore;
    private int computerScore;
    private int numberOfGames;

    public GameProcessor(String name){
        inputManager=new InputManager();
        this.name=name;
        computer=new Computer();
        playerScore = 0;
        computerScore = 0;
        numberOfGames = 0;
    }

    public void startGame() {
        int playerinput = inputManager.getInputFromPalyer();
        GameHelper.display(name, playerinput);
        // Get moves
        int computerinput = computer.getInput();
        GameHelper.display("computer", computerinput);
        int compareResult=GameHelper.compareSelections(playerinput, computerinput);
        switch (compareResult) {
            case 0: // Tie
                System.out.println("Tie!");
                break;
            case 1: // player wins
                System.out.println(name+ " Beats " + "computer" +" You won!");
                playerScore++;
                break;
            case -1: // Computer wins
                System.out.println("Computer" +" Beats "+ name+" You Lost!");
                computerScore++;
                break;
        }
        numberOfGames++;
        if(playerScore==5)
        {
            System.out.println(name+" HAS WON THE GAME.............");
            new GameProcessor(name);
        }
        if(computerScore==5)
        {
            System.out.println("Computer "+" HAS WON THE GAME............");
            new GameProcessor(name);
        }
        // Ask the player to play again
        if (inputManager.playAgain()) {
            System.out.println();
            startGame();
        } else {
            printStats();
        }
    }

    public void printStats()
    {
        System.out.println("Number of games played is "+numberOfGames);
        System.out.println(name+"'s score "+playerScore);
        System.out.println("Computers score "+computerScore);
    }
}
