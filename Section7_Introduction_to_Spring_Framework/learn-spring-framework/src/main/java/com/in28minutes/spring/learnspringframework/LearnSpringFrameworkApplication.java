package com.in28minutes.spring.learnspringframework;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in28minutes.spring.learnspringframework.game.GameRunner;
import com.in28minutes.spring.learnspringframework.game.GamingConsole;
import com.in28minutes.spring.learnspringframework.game.MarioGame;
import com.in28minutes.spring.learnspringframework.game.PacmanGame;
import com.in28minutes.spring.learnspringframework.game.SuperContraGame;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		
		// This line of code creates spring application context
		ConfigurableApplicationContext context 
				= SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		GameRunner runner = context.getBean(GameRunner.class);
		
//		 We can use any of the games MarioGame or super contra without making changes to any of the classes
//		MarioGame game = new MarioGame();
//		SuperContraGame game = new SuperContraGame();
//		GamingConsole game = new PacmanGame(); // Step1
//		GameRunner runner = new GameRunner(game); // Step2
		runner.run();
	}

}
