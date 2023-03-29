package com.in28minutes.spring.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in28minutes.spring.learnspringframework.enterprise.example.web.MyWebController;
import com.in28minutes.spring.learnspringframework.game.GameRunner;

@SpringBootApplication
//@ComponentScan("com.in28minutes.spring.learnspringframework")
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
		MyWebController controller =  context.getBean(MyWebController.class);
		System.out.println(controller.returnValueFromBusinessService()); 
	}

}
