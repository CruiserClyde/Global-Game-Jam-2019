package states;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class Jeu2 extends BasicGameState {
	
	@Override
	public int getID() {
		return 2;
	}

	Image maison;
	int choix;
	boolean pause,debut_vague;
	
	public Jeu2() {
	}

	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		maison=new Image("ressources/pictures/logo.png");
		choix=0;
		pause=false;
		debut_vague=false;
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		g.setColor(Color.gray);
		g.fillRect(650, 0, 650, 800);
		maison.draw(250,150);

	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		if(pause) {
			pause=false;
			sbg.enterState(3);
		}
		if(debut_vague) {
			debut_vague=false;
			sbg.enterState(1);
		}

	}

	public void keyPressed(int key, char c) {
		super.keyPressed(key, c);
		if(key==Input.KEY_ESCAPE)
			pause=true;
		if(key==Input.KEY_A)
			debut_vague=true;
	}

}
