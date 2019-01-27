package states;
import java.awt.Point;
import java.util.Vector;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import gameplay.Container;
import gameplay.house.Composant;
import gameplay.house.Door;
import gameplay.house.Roof;
import gameplay.house.Tier;
import gameplay.house.Wall;
import gameplay.house.Window;
import main.Launcher;
import pathfinderlib.basics.Matrix;
import pathfinderlib.basics.Moves;
import pathfinderlib.basics.State;
import pathfinderlib.exceptions.PathfindingException;
import pathfinderlib.pathfinder.PathFinder;

public class Jeu extends BasicGameState {	
	
	@Override
	public int getID() {
		return 1;
	}
	
	private boolean pause,vague;
	private Container container;
	private Composant nextUpgrade[];
	int kredit,prixM,prixT,prixF,prixP;
	
	private Door porteNul;
	private Wall murNul;
	private Roof toitNul;
	private Window fenetreNul;
	
	private Door porteStandard;
	private Wall murStandard;
	private Roof toitTuile;
	private Window fenetreStandard;
	
	private Door porteBois;
	private Wall murBois;
	private Roof toitBois;
	private Window fenetreBois;
	
	private Door portePierre;
	private Wall murPierre;
	private Roof toitPierre;
	private Window fenetrePierre;
	
	public Jeu() {	
	}

	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		container = new Container(); 
		pause=false;
		vague=false;
		nextUpgrade = new Composant[4];
		kredit=0;
		prixM=25;
		prixT=25;
		prixF=25;
		prixP=25;
		
		porteNul = new Door (0,"porteNul",Tier.Nul);
		murNul = new Wall (0,"murNul",Tier.Nul);
		toitNul = new Roof (0,"toitNul",Tier.Nul);
		fenetreNul = new Window (0,"fenetreNul",Tier.Nul);
		
		porteStandard = new Door (25,"porteStandard",Tier.Standard);
		murStandard = new Wall (25,"murStandard",Tier.Standard);
		toitTuile = new Roof (25,"toitTuile",Tier.Standard);
		fenetreStandard = new Window (25,"fenetreStandard",Tier.Standard);
		
		porteBois = new Door (50,"porteBoisSolide",Tier.Bois);
		murBois = new Wall (50,"murBoisSolide",Tier.Bois);
		toitBois = new Roof (50,"toitBoisSolide",Tier.Bois);
		fenetreBois = new Window (50, "fenetreBoisSolide",Tier.Bois);
		
		portePierre = new Door (125,"portePierre",Tier.Pierre);
		murPierre = new Wall (125,"murPierre",Tier.Pierre);
		toitPierre = new Roof (125,"toitPierre",Tier.Pierre);
		fenetrePierre = new Window (125, "fenetrePierre",Tier.Pierre);
		
		
		nextUpgrade[0] = porteStandard;
		nextUpgrade[1] = murStandard;
		nextUpgrade[2] = toitTuile;
		nextUpgrade[3] = fenetreStandard;

	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		container.getHouse().render(g);

		if(!vague)
		{
			g.setColor(Color.gray);
			g.fillRect(600, 0, 600, 800);
			g.setColor(Color.white);
			g.fillRect(625, 10, 160 , 160);
			g.fillRect(625, 190, 160 , 160);
			g.fillRect(625, 370, 160 , 160);
			g.fillRect(625, 550, 160 , 160);
			g.setColor(Color.red);
			g.fillRect(625, 10, 10, 10);
			g.fillRect(625, 190, 10, 10);
			g.fillRect(625, 370, 10, 10);
			g.fillRect(625, 550, 10, 10);
			g.setColor(Color.black);
			g.drawString("Krédits: "+ kredit, 610, 750);
			if(kredit>=prixM) {
				g.setColor(Color.white);
				g.drawString("upgrade: "+prixM+" K", 625, 170);	
			}
			else {
				g.setColor(Color.darkGray);
				g.drawString("upgrade: "+prixM+" K", 625, 170);	
			}
			if(kredit>=prixT) {
				g.setColor(Color.white);
				g.drawString("upgrade: "+prixT+" K", 625, 350);
			}
			else {
				g.setColor(Color.darkGray);
				g.drawString("upgrade: "+prixT+" K", 625, 350);	
			}
			if(kredit>=prixP) {
				g.setColor(Color.white);
				g.drawString("upgrade: "+prixP+" K", 625, 530);
			}
			else {
				g.setColor(Color.darkGray);
				g.drawString("upgrade: "+prixP+" K", 625, 530);	
			}
			if(kredit>=prixF) {
				g.setColor(Color.white);
				g.drawString("upgrade: "+prixF+" K", 625, 710);
			}
			else {
				g.setColor(Color.darkGray);
				g.drawString("upgrade: "+prixF+" K", 625, 710);	
			}
			for(int i = 0; i < 4; i++)
			{
				nextUpgrade[i].render(g);
			}
		}	
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		
		
		switch(container.getHouse().getComp(0).getTier())
		{
		
		}
		
		if(pause) {
			pause=false;
			sbg.enterState(3);
		}
		
	}

	@Override
	public void keyPressed(int key, char c) {
		super.keyPressed(key, c);
		if(key==Input.KEY_ESCAPE)
			pause=true;
		if(key==Input.KEY_A)
			{
				vague = !vague;
			}
		if(key==Input.KEY_K)
			kredit=kredit+100;
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
	
	public void mousePressed(int button, int x, int y) {
		System.out.println("X:"+x+" Y:"+y);
	}
}