package gameplay.characters;

import org.newdawn.slick.state.StateBasedGame;

public class Plumber extends Allies {

	private static final long serialVersionUID = 7248176344434363090L;

	public Plumber(StateBasedGame sbg) {
		super((int)Math.random()*24, (int)Math.random()*24, 100, 0, 10, "allier1", sbg);
	}

}
