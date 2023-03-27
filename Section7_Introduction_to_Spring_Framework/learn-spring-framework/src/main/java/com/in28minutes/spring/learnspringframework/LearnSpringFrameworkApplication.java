package com.in28minutes.spring.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.spring.learnspringframework.game.GameRunner;
import com.in28minutes.spring.learnspringframework.game.MarioGame;
import com.in28minutes.spring.learnspringframework.game.PacmanGame;
import com.in28minutes.spring.learnspringframework.game.SuperContraGame;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
//		SpringApplication.run(LearnSpringFrameworkApplication.class, args);
//		 We can use any of the games MarioGame or super contra without making changes to any of the classes
//		MarioGame game = new MarioGame();
//		SuperContraGame game = new SuperContraGame();
		PacmanGame game = new PacmanGame();
		GameRunner runner = new GameRunner(game);
		runner.run();
	}

}
