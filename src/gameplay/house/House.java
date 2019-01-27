package gameplay.house;

import java.io.Serializable;

import org.newdawn.slick.Graphics;

import gameplay.interfaces.Rendering;

public class House implements Serializable, Rendering
{
	private int positionX; //en case
	private int positionY; //en case
	private int tailleX; //en case
	private int tailleY; //en case
	private int PV;
	private int PVMax;
	private Composant comp[];
	private int regenRate;
	
	private float fireResistance;
	private float lightnigResistance;
	private float groundResistance;
	private float acideResistance;
	
	public House(int posX, int posY, Wall wall, Roof roof, Door door, Window window)
	{
		comp = new Composant[4];
		comp[0] = wall;
		comp[1] = roof;
		comp[2] = door;
		comp[3] = window;
		
		this.tailleX = 5;
		this.tailleY = 5;
		
		PVMax = 0; //détermination es PV de base en fonction de la taille
		for(int i = 0; i < comp.length; i++) //bonus des composants
		{
			PVMax += comp[i].getBonusPV();
			fireResistance = comp[i].getTier().getFireResistance();
			lightnigResistance = comp[i].getTier().getLightningResistance();
			groundResistance = comp[i].getTier().getGroundResistance();
			acideResistance = comp[i].getTier().getAcideResistance();
		}
		PV = PVMax;
		
		positionX = posX;
		positionY = posY;
		regenRate = (int) (100*PV/PVMax);
	}
	
	public void setWall(Wall wall)
	{
		comp[0] = wall;
	}
	public void setRoof(Wall roof)
	{
		comp[1] = roof;
	}
	public void setDoor(Wall door)
	{
		comp[2] = door;
	}
	public void setWindow(Wall window)
	{
		comp[3] = window;
	}
	
	public Composant getComp(int i)
	{
		return comp[i];
	}
	public int getPV()
	{
		return PV;
	}
	public int getPVMax()
	{
		return PVMax;
	}
	public int getRegenRate()
	{
		return regenRate;
	}
	public int getPositionX()
	{
		return positionX;
	}
	public int getPositionY()
	{
		return positionY;
	}
	public int getTailleX()
	{
		return tailleX;
	}
	public int getTailleY()
	{
		return tailleY;
	}
	
	public void takeDamage(int damage, int element)
	{
		switch(element)
		{
			case 0:
				damage -= lightnigResistance;
				break;
			case 1:
				damage -= fireResistance;
				break;
			case 2:
				damage -= groundResistance;
				break;
			case 3:
				damage -= acideResistance;
				break;
		}
		PV -= damage;
		
		regenRate = (int) (100*PV/PVMax);
	}

	@Override
	public void render(Graphics g) 
	{
		g.drawImage(comp[0].getTexture(), positionX*32, positionY*32, (positionX+tailleX)*32, (positionY+tailleY)*32, 0, 0, 159, 159); //affiche le mur
		g.drawImage(comp[1].getTexture(), positionX*32, positionY*32, (positionX+tailleX)*32, (positionY+tailleY)*32, 0, 0, 159, 159); //affiche le toit
		g.drawImage(comp[2].getTexture(), positionX*32, positionY*32, (positionX+tailleX)*32, (positionY+tailleY)*32, 0, 0, 159, 159); //affiche la porte
		g.drawImage(comp[3].getTexture(), positionX*32, positionY*32, (positionX+tailleX)*32, (positionY+tailleY)*32, 0, 0, 159, 159); //affiche la fenetre
	}

	@Override
	public void update(int delta) {
		// TODO Auto-generated method stub
		
	}



	
	
	
	
	

}
