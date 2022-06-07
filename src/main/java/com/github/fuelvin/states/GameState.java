package com.github.fuelvin.states;

import java.awt.Graphics;
import java.io.InputStreamReader;

import com.github.fuelvin.assets.Description;
import com.github.fuelvin.assets.Player;
import com.github.fuelvin.assets.Text;
import com.github.fuelvin.game.Handler;
import com.github.fuelvin.game.World;

public class GameState extends State{
	
	private Player player;
	private World world;
	public static boolean flag;
	private Description playerDescription;
	public static int coins = 0;
	public static int xp = 0;
	private Text coinsText;

	public GameState(Handler handler) {
		super(handler); //calls constructor of "State" class

		String path = "/worlds/world1.txt";
		System.out.println(path);
		world = new World(handler, new InputStreamReader(getClass().getResourceAsStream(path)));
		handler.setWorld(world);
		playerDescription = new Description(2, Player.name, Player.health, Player.baseHealth, Player.level, handler);
		
	}
	

	
	@Override
	public void tick() {
		world.tick();
		
	}

	@Override
	public void render(Graphics g) {
		world.render(g);
		playerDescription.render(g);
		coinsText = new Text(coins + "", 50, 126, 4, 4);
		coinsText.render(g);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
