package com.github.fuelvin;

import com.github.fuelvin.game.Game;

public class Launcher{
	public static void main(String[] args) {
		Game game = new Game("Title", 800, 800);
		game.start();
	}
}
