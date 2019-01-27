package gameplay.characters;
import java.io.Serializable;

import org.newdawn.slick.Graphics;

import gameplay.interfaces.Rendering;
import ressources.Ressources;

public abstract class Entity implements Serializable, Rendering {
	private static final long serialVersionUID = 3969755682038352456L;
	// Vie
	protected int HPmax;
	protected int HP;
	// Vie supplémentaire
	protected int shield;
	// Position
	protected int x;
	protected int y;
	// Dommages aux ennemis
	protected int damage;
	// Dommages reçus
	private String sprite;
	protected Side side;
	
	public Entity(int x, int y, int HPmax, int shield, int dmg, String sprite, Side side) {
		this.x = x;
		this.y = y;
		this.HP = HPmax;
		this.HPmax = HPmax;
		this.shield = shield;
		this.damage = dmg;
		this.sprite = sprite;
		this.side = side;
	}
	
	public void getHurt(int value) {
		HP -= (value-shield);
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Ressources.SPRITES.get(sprite), x*32, y*32);
	}

	public int getHPmax() {
		return HPmax;
	}

	public int getHP() {
		return HP;
	}

	public int getShield() {
		return shield;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getDamage() {
		return damage;
	}

	public String getSprite() {
		return sprite;
	}

	public Side getSide() {
		return side;
	}	
}
