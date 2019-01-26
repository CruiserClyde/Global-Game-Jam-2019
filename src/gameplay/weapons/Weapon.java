package gameplay.weapons;

import java.io.Serializable;

import gameplay.interfaces.Rendering;

public abstract class Weapon implements Serializable, Rendering {
	private int x;
	private int y;
	private int hp;
	private int charge;

	public Weapon() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract void trigger();

}
