package com.in28minutes.spring.learnspringframework.game;

public class GameRunner {
	// Using GamingConsole we don't have be specific that we need to use which game 
	// It is not tightly coupled with the game
	private GamingConsole game;
	public GameRunner(GamingConsole game) {
		this.game = game;
	}
	public void run() {
		game.up();
		game.down();
		game.left();
		game.right();
		
	}
	
}