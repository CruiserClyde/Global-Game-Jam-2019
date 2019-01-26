package gameplay.house;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import gameplay.interfaces.Rendering;

public class Door extends Composant implements Rendering
{

	public Door(int prix,String texture, Tier tier) 
	{
		super(prix, texture, tier);
	}

	@Override
	public void render(Graphics g) {
		
		g.drawImage(texture, 8,3);
		
	}

	@Override
	public void update(int delta) {
		// TODO Auto-generated method stub
		
	}
	
	

}
