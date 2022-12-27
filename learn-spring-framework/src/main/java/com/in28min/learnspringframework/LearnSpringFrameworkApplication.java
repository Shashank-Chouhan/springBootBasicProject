package com.in28min.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in28min.learnspringframework.game.GameRunner;
import com.in28min.learnspringframework.game.MarioGame;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context  = 
				SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		
		GameRunner runner = context.getBean(GameRunner.class);
		
//		MarioGame game1 = new MarioGame();
//		SuperContraGame game2 = new SuperContraGame();
		
//		GameRunner runner = new GameRunner(game1);
		
		
		
		runner.runGame();
	}

}
