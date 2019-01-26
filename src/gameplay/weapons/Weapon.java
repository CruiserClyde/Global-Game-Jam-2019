package gameplay.weapons;

import java.io.Serializable;

import gameplay.characters.Entity;
import gameplay.interfaces.Rendering;
import pathfinderlib.basics.Matrix;

public abstract class Weapon implements Serializable, Rendering {
	private static final long serialVersionUID = 1L;
	private int x;
	private int y;
	private int hp;
	private int charge;
	private int range;

	public Weapon() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract void trigger(Matrix<Entity> entities);

}
