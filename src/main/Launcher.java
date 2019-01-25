package main;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import states.TitleScreen;

public class Launcher extends StateBasedGame {

	public Launcher(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initStatesList(GameContainer gc) throws SlickException {
		// TODO Auto-generated method stub
		addState(new TitleScreen());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppGameContainer app;
		try {
			app = new AppGameContainer(new Launcher("Z'homebies"));
			app.setDisplayMode(800, 600, false);
			app.setShowFPS(false);
			app.setFullscreen(false);
			app.setIcon("Pictures/icon.png");
			app.start();
		} catch(SlickException e){
			e.printStackTrace();
		}
	}

}
