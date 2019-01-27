package gameplay.characters;
import org.newdawn.slick.state.StateBasedGame;

public class NormalZombie extends Ennemies{
	private static final long serialVersionUID = 1480552482164050522L;
	public NormalZombie(StateBasedGame sbg) {
		super(position_rd_x(), position_rd_y(), 50, 0, 2, "zombie3", sbg);
	}
}