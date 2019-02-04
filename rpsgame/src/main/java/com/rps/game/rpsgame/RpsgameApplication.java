package com.rps.game.rpsgame;

import com.rps.game.rpsgame.service.GameHelper;
import com.rps.game.rpsgame.service.GameProcessor;
import com.rps.game.rpsgame.service.InputManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RpsgameApplication {

	public static void main(String[] args) {

		SpringApplication.run(RpsgameApplication.class, args);
        startGame();
	}

	private static void startGame(){
        InputManager inputManager=new InputManager();
        String name =inputManager.askName();
        GameProcessor gameProc=new GameProcessor(name);
        gameProc.startGame();
	}

}

