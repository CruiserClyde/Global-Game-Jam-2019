package gameplay.characters;

import java.awt.Point;
import java.util.Vector;

import org.newdawn.slick.state.StateBasedGame;

import pathfinderlib.basics.Moves;
import pathfinderlib.exceptions.PathfindingException;
import states.Jeu;

public abstract class Allies extends Entity {
	
	private static final long serialVersionUID = -1975291122370298436L;
	protected Moves nextmove;
	protected transient StateBasedGame sbg;
	private int timer;
	protected int speed;
	
	public Allies(int x, int y, int HPmax, int shield, int dmg, String sprite, StateBasedGame sbg) {
		super(x, y, HPmax, shield, dmg, sprite);
		nextmove = null;
		timer = 0;
	}
	@Override
	public void update(int delta) {
		// TODO Auto-generated method stub
		try {
			Vector<Moves> path = ((Jeu)sbg.getState(1)).calculatePathToHouse(new Point(x, y));
			if (!path.isEmpty()) {
				nextmove = path.get(0);
			} else {
				nextmove = null;
			}
		} catch (PathfindingException e) {
			// TODO Auto-generated catch block
			nextmove = null;
		}
		timer+=delta;
		
		if (timer >= speed) {
			switch (nextmove) {
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

}
