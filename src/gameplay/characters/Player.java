package gameplay.characters;

import org.newdawn.slick.state.StateBasedGame;

public class Player extends Entity {

	private static final long serialVersionUID = 1605891455335670217L;
	protected transient StateBasedGame sbg;
	private int timer;
	
	public Player(int x, int y, int HPmax, int shield, int dmg, String sprite, StateBasedGame sbg) {
		super(x, y, HPmax, shield, dmg, sprite);
		timer = 0;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(int delta) {
		// TODO Auto-generated method stub
		
	}

}
