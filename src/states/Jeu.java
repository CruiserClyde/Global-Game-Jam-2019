package states;
import java.awt.Point;
import java.util.Vector;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import com.sun.xml.internal.ws.api.server.Container;

import pathfinderlib.basics.Moves;

public class Jeu extends BasicGameState {	
	private Image maison;
	private int choix;
	private boolean pause;
	private Container container;
	
	public Jeu() {	
	}

	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		maison=new Image("pictures/logo.png");
		choix=0;
		pause=false;
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		maison.draw(250,150);

	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		if(pause) {
			pause=false;
			sbg.enterState(2);
		}
	}

	@Override
	public void keyPressed(int key, char c) {
		super.keyPressed(key, c);
		if(key==Input.KEY_ESCAPE)
			pause=true;
	}
	
	public void save() {
		//save
	}
	
	private void load() {
		//load
	}
	
	private Vector<Moves> calculatePathToHouse(Point start) {
		return null;
	}
	
	@Override
	public int getID() {
		return 1;
	}

}
