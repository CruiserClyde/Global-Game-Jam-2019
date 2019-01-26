package gameplay;

import java.io.Serializable;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public abstract class Composant implements Serializable
{
	private int bonusPV;
	private int bonusDef;
	private int prix;
	private Image texture;
	
	private float fireResistance;
	private float lightnigResistance;
	private float groundResistance;
	private float acideResistance;
	
	
	public Composant(int PV, int def, int prix, float fRes, float lRes, float gRes, float aRes) throws SlickException
	{
		bonusPV = PV;
		this.prix = prix;
		bonusDef = def;
		texture = new Image("pictures/placeHolder.png");
		fireResistance = fRes;
		lightnigResistance = lRes;
		groundResistance = gRes;
		acideResistance = aRes;
	}
	
	public int getBonusPV()
	{
		return bonusPV;
	}
	public int getPrix()
	{
		return prix;
	}
	public int getBonusDef()
	{
		return bonusDef;
	}
	public float getFireResistance()
	{
		return fireResistance;
	}
	public float getLightningResistance()
	{
		return lightnigResistance;
	}
	public float getGroundResistance()
	{
		return groundResistance;
	}
	public float getAcideResistance()
	{
		return acideResistance;
	}
}
