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

import gameplay.Container;
import main.Launcher;
import pathfinderlib.basics.Matrix;
import pathfinderlib.basics.Moves;
import pathfinderlib.basics.State;
import pathfinderlib.exceptions.PathfindingException;
import pathfinderlib.pathfinder.PathFinder;

public class Jeu extends BasicGameState {	
	private Image maison;
	private int choix;
	private boolean pause;
	private Container container;
	
	public Jeu() {	
	}

	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		maison=new Image("ressources/pictures/logo.png");
		container = new Container(); 
		
		
		choix=0;
		pause=false;
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		maison.draw(250,150);
		container.getHouse().render(g);
		
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
	
	public Vector<Moves> calculatePathToHouse(Point start) throws PathfindingException {
		Matrix<State> laby = new Matrix<State>(Launcher.WIDTH, Launcher.HEIGHT);
		for (int i=0;i<Launcher.WIDTH;i++) {
			for (int k=0;k<Launcher.HEIGHT;k++) {
				if (container.getEntities().get(i, k) != null || container.getWeapons().get(i, k) != null) {
					laby.set(i, k, State.Obstacle);
				} else {
					laby.set(i, k, State.Void);
				}
			}
		}
		PathFinder pf = new PathFinder(laby, start, new Point(container.getHouse().getPositionX()+(container.getHouse().getTailleX()/2), container.getHouse().getPositionY()+(container.getHouse().getTailleY()/2)));
		return pf.searchPath();
	}
	
	@Override
	public int getID() {
		return 1;
	}

}
