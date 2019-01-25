package gameplay.characters;
import java.io.Serializable;

public class Characters implements Serializable {
	// Type de personnage
	private String type;
	// Vie
	private int life;
	// Vie supplémentaire
	private int shield;
	// Position
	public int x;
	public int y;
	// Vitesse
	private int speed;
	// Dommages aux ennemis
	private int damagesDealt;
	// Dommages reçus
	private int damagesReceived;
	
	public Characters() {
		// TODO Auto-generated constructor stub
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getShield() {
		return shield;
	}

	public void setShield(int shield) {
		this.shield = shield;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getDamagesDealt() {
		return damagesDealt;
	}

	public void setDamagesDealt(int damagesDealt) {
		this.damagesDealt = damagesDealt;
	}

	public int getDamagesReceived() {
		return damagesReceived;
	}

	public void setDamagesReceived(int damagesReceived) {
		this.damagesReceived = damagesReceived;
	}
}
