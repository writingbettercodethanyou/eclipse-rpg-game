package com.github.fuelvin.States;

import java.awt.Graphics;

import com.github.fuelvin.Game.ClickListener;
import com.github.fuelvin.Game.Handler;
import com.github.fuelvin.Game.UIImageButton;
import com.github.fuelvin.Game.UIManager;
import com.github.fuelvin.Assets.Assets;

public class MenuState extends State{
	
	private UIManager uiManager;

	public MenuState(Handler handler) {
		super(handler);
		uiManager = new UIManager(handler);
		handler.getMouseManager().setUIManager(uiManager);
		
		uiManager.addObject(new UIImageButton(200, 200, 128, 64, Assets.buttonStart, new ClickListener() {

			@Override
			public void onClick() {
				handler.getMouseManager().setUIManager(null);
				State.setState(handler.getGame().gameState);
			}
			}));
	}

	@Override
	public void tick() {
		uiManager.tick();
	}

	@Override
	public void render(Graphics g) {
		uiManager.render(g);
	}

	
	
	
	
	
	
}
