package states;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class Pause extends BasicGameState {

	@Override
	public int getID() {
		return 3;
	}
	
	int choix,save;
	boolean reprendre,menu;
	static boolean Save;
	
	public Pause() {	
	}

	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		choix = 0;
		reprendre = false;
		menu = false;
		Save = false;
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		g.setColor(Color.white);
		g.drawString("PAUSE",300,200);
		if(choix == 0) {
			g.setColor(Color.red);
			g.drawString("Reprendre", 250,250);
			g.setColor(Color.white);
			g.drawString("Sauvegarder / Retour menu", 250, 270);
			g.drawString("Menu Principal",250,290);
		}
		else if(choix == 1) {
			g.setColor(Color.white);
			g.drawString("Reprendre",250,250);
			g.setColor(Color.red);
			g.drawString("Sauvegarder / Retour menu", 250, 270);
			g.setColor(Color.white);
			g.drawString("Menu Principal",250,290);			
		}
		else if(choix == 2) {
			g.setColor(Color.white);
			g.drawString("Reprendre",250,250);
			g.setColor(Color.white);
			g.drawString("Sauvegarder / Retour menu", 250, 270);
			g.setColor(Color.red);
			g.drawString("Menu Principal",250,290);	
		}
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		if(reprendre) {
			reprendre=false;
			sbg.enterState(1);
		}
		if(menu) {
			menu=false;
			sbg.enterState(0);
		}
		if(Save) {
			save=0;
			sbg.enterState(0);
		}
	}
	
	public void keyPressed(int key, char c) {
		super.keyPressed(key, c);
		switch(key) {
		case Input.KEY_DOWN:
			choix++;
			if(choix>2)
				choix=0;
			break;
		case Input.KEY_UP:
			choix--;
			if(choix<0)
				choix=2;
			break;
		case Input.KEY_ENTER:
			if(choix==0)
				reprendre=true;
			else if(choix==1) {
				Save=true;
				save=1;
			}
			else if(choix==2)
				menu=true;
		}
	}
}
