package com.in28min.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("jump");
	}
	@Override
	public void down() {
		System.out.println("duck");
	}
	@Override
	public void left() {
		System.out.println("stop");
	}
	@Override
	public void right() {
		System.out.println("fast");
	}
}
