package gameplay.characters;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;
import org.newdawn.slick.state.StateBasedGame;

public class Player extends Entity {

	private static final long serialVersionUID = 1605891455335670217L;
	protected transient StateBasedGame sbg;
	private int money;
	
	
	public Player(int x, int y, int HPmax, int shield, int dmg, String sprite, StateBasedGame sbg) {
		super(x, y, HPmax, shield, dmg, sprite, Side.Ally);
		
	}

	
	public void update(GameContainer gc, int delta) {
		Input input = gc.getInput();
		if(input.isKeyPressed(Input.KEY_UP) && y>0){
			y--;
		}
		if(input.isKeyPressed(Input.KEY_DOWN) && y<800){
			y++;
		}
		if(input.isKeyPressed(Input.KEY_LEFT) && x>0) {
			x--;
		}
		if(input.isKeyPressed(Input.KEY_RIGHT)&& x<800) {
			x++;
		}
		
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	// update sans le game container
	@Override
	public void update(int delta) {
		// TODO Auto-generated method stub
		
	}

}
