package gameplay.characters;

import java.awt.Point;
import java.util.Vector;

import org.newdawn.slick.state.StateBasedGame;

import pathfinderlib.basics.Moves;
import pathfinderlib.exceptions.PathfindingException;
import states.Jeu;

public abstract class Ennemies  extends Entity {
	private static final long serialVersionUID = -174618717306908057L;
	protected Moves nextmove;
	protected transient StateBasedGame sbg;
	private int timer;
	protected int speed;
	
	public Ennemies(int x, int y, int HPmax, int shield, int dmg, String sprite, StateBasedGame sbg) {
		super(x, y, HPmax, shield, dmg, sprite, Side.Ennemy);
		// TODO Auto-generated constructor stub
		nextmove = null;
		timer = 0;
		this.sbg = sbg;
	}

	@Override
	public void update(int delta) {
		// TODO Auto-generated method stub
		//System.out.println("X: "+x +" Y: "+y);
		
		try {
			Vector<Moves> path = ((Jeu)sbg.getState(1)).calculatePathToHouse(new Point(x, y));
			if (!path.isEmpty()) {
				nextmove = path.get(0);
			} else {
				nextmove = null;
			}
		} 
		catch (PathfindingException e) 
		{
			// TODO Auto-generated catch block
			nextmove = null;
		}
		catch (NullPointerException e) 
		{
				// TODO Auto-generated catch block
				nextmove = null;
		}
		timer+=delta;
		
		if (timer >= speed ) 
		{
			if(nextmove != null)
			{
				switch (nextmove) 
				{
				case Down:
					y++;
					break;
				case Left:
					x--;
					break;
				case Right:
					x++;
					break;
				case Up:
					y--;
					break;
				}
			}
			timer -= 1000;
		}
	}
	
	public Moves getNextmove() {
		return nextmove;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSbg(StateBasedGame sbg) {
		this.sbg = sbg;
	}
	public static int position_rd_x() {
		int x=(int)(Math.random()*24);
		while(x>=10 && x<=15) {
			x = (int)(Math.random()*24);
		}return x;
	}
	public static int position_rd_y() {
		int y=(int)(Math.random()*24);
		while(y>=10 && y<=15) {
			y = (int)(Math.random()*24);
		}
		return y;
	}
}
