package gameplay.characters;

import org.newdawn.slick.state.StateBasedGame;

public class Banker extends Allies{

	private static final long serialVersionUID = 3451163395170867574L;

	public Banker(StateBasedGame sbg) {
		super((int)Math.random()*24, (int)Math.random()*24, 100, 0, 15, "allier2", sbg);
	}

}
