package gameplay;

import java.io.Serializable;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public abstract class Composant implements Serializable
{
	private int bonusPV;
	private int prix;
	private Image texture;
	
	
	Composant() throws SlickException
	{
		bonusPV = 0;
		prix = 0;
		texture = new Image("pictures/placeHolder.png");
	}
	
}
