package gameplay.characters;
import org.newdawn.slick.state.StateBasedGame;

public class CowZombie extends Ennemies {
	private static final long serialVersionUID = 1362380441280261972L;

	public CowZombie(StateBasedGame sbg) {
		super(position_rd_x(), position_rd_y(), 100, 10, 10, "zombie2", sbg);
	}
}
	