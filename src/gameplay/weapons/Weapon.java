package gameplay.weapons;

import java.io.Serializable;

import org.newdawn.slick.Graphics;

import gameplay.characters.Entity;
import gameplay.interfaces.Rendering;
import pathfinderlib.basics.Matrix;
import ressources.Ressources;
import gameplay.Container;

public abstract class Weapon implements Serializable, Rendering {
	private static final long serialVersionUID = 1L;
	protected int x;
	protected int y;
	protected int hp;
	protected int shield;
	protected int charge;
	protected int range;
	private int price;
	private String sprite;
	protected transient Container cnt;

	public Weapon(int x, int y, int hp, int shield, int range, int price, String sprite, Container cnt) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
		this.hp = hp;
		charge = 0;
		this.shield = shield;
		this.range = range;
		this.price = price;
		this.sprite = sprite;
		this.cnt = cnt;
	}
	
	public void getDamage(int value) {
		hp -= (value-shield);
	}
	
	public abstract void trigger(Matrix<Entity> entities);
	
	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(Ressources.SPRITES.get(sprite), x, y);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getHp() {
		return hp;
	}

	public int getCharge() {
		return charge;
	}

	public int getRange() {
		return range;
	}

	public int getPrice() {
		return price;
	}

	public void setCnt(Container cnt) {
		this.cnt = cnt;
	}

}
