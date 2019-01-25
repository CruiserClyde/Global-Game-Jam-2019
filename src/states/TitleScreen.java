package states;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class TitleScreen extends BasicGameState {

	@Override
	public int getID() {
		return 0;
	}
	
	int choix;
	boolean continuer, newgame, options, web, quit;
	
	
	public TitleScreen() {
	}

	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		continuer=false;
		newgame=false;
		options=false;
		web=false;
		quit=false;
		choix=0;
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		g.setColor(Color.white);
		g.drawString("Menu Principal",300,200);
		if(choix==0) {
			g.setColor(Color.gray);
			g.drawString("Continuer", 250,250 );
			g.setColor(Color.red);
			g.drawString("Nouvelle Partie",250,270);
			g.setColor(Color.white);
			g.drawString("Options", 250, 290);
			g.drawString("Web", 250, 310);
			g.drawString("Quitter",250,330);
		}
		else if(choix==1) {
			g.setColor(Color.gray);
			g.drawString("Continuer", 250,250 );
			g.setColor(Color.white);
			g.drawString("Nouvelle Partie",250,270);
			g.setColor(Color.red);
			g.drawString("Options", 250, 290);
			g.setColor(Color.white);
			g.drawString("Web", 250, 310);
			g.drawString("Quitter",250,330);
		}
		else if(choix==2) {
			g.setColor(Color.gray);
			g.drawString("Continuer", 250,250 );
			g.setColor(Color.white);
			g.drawString("Nouvelle Partie",250,270);
			g.drawString("Options", 250, 290);
			g.setColor(Color.red);
			g.drawString("Web", 250, 310);
			g.setColor(Color.white);
			g.drawString("Quitter",250,330);
		}
		else if(choix==3) {
			g.setColor(Color.gray);
			g.drawString("Continuer", 250,250 );
			g.setColor(Color.white);
			g.drawString("Nouvelle Partie",250,270);
			g.drawString("Options", 250, 290);
			g.drawString("Web", 250, 310);
			g.setColor(Color.red);
			g.drawString("Quitter",250,330);
		}
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		if(quit)
			gc.exit();
		if(newgame) {
			newgame=false;
			sbg.enterState(1);
		}
			

	}
	@Override
	public void keyPressed(int key, char c) {
		super.keyPressed(key, c);
		switch(key) {
			case Input.KEY_DOWN:
				choix++;
				if(choix>3) {
					choix=0;
				}
				break;
			case Input.KEY_UP:
				choix--;
				if(choix<0) {
					choix=3;
				}
				break;
			case Input.KEY_ENTER:
				if(choix==0) {
					newgame=true;
				}
				else if(choix==1) {
					options=true;
				}
				else if(choix==2) {
					web=true;
				}
				else if(choix==3) {
					quit=true;
				}
		}
		
	}
}
