package com.in28min.learnspringframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

//	private MarioGame game;
//	private SuperContraGame game;
	
	@Autowired
	private GamingConsole game;
	
	public GameRunner(GamingConsole game) {
		this.game = game;
	} 
	
	public void runGame() {
		game.down();
		game.up();
		game.left();
		game.right();
	}

}
