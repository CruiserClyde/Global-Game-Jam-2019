package gameplay.characters;
import java.io.Serializable;

import org.newdawn.slick.Graphics;

import gameplay.interfaces.Rendering;
import ressources.Ressources;

public abstract class Entity implements Serializable, Rendering {
	private static final long serialVersionUID = 3969755682038352456L;
	// Vie
	private int HPmax;
	private int HP;
	// Vie supplémentaire
	private int shield;
	// Position
	public int x;
	public int y;
	// Vitesse
	private int speed;
	// Dommages aux ennemis
	private int damage;
	// Dommages reçus
	private String sprite;
	
	public Entity(int x, int y) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(Ressources.SPRITES.get(sprite), x, y);
	}
	
	
}
