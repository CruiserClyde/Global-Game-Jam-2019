package gameplay;

import java.io.Serializable;

public class House implements Serializable
{
	private int positionX; //en case
	private int positionY; //en case
	private int tailleX; //en case
	private int tailleY; //en case
	private int PV;
	private int PVMax;
	private int def; // stat de deffance
	private Composant comp[];
	
	public House()
	{
		tailleX = 1;
		tailleY = 1;
		PV = 1;
		PVMax = 1;
		def = 1;
	}
	
	public int getPV()
	{
		return PV;
	}
	public int getPVMax()
	{
		return PVMax;
	}
	
	public void takeDamage(int damage)
	{
		PV -= damage-def;
	}
	
	
	
	
	

}
