package gameplay.characters;

import org.newdawn.slick.state.StateBasedGame;

public class BigZombie extends Ennemies{
	private static final long serialVersionUID = 7851604530872540580L;

	public BigZombie(StateBasedGame sbg) {
		super((int)Math.random()*24, (int)Math.random()*24, 100, 10, 10, "zombie", sbg);
		// TODO Auto-generated constructor stub
	}

}
