package gameplay.house;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import gameplay.interfaces.Rendering;

public class Window extends Composant implements Rendering
{

	public Window(int prix,String texture,Tier tier) 
	{
		super(prix,texture,tier);
	}

	@Override
	public void render(Graphics g) {

		g.drawImage(texture, 625, 530);
		
	}

	@Override
	public void update(int delta) {
		// TODO Auto-generated method stub
		
	}

}
