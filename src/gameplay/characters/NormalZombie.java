package gameplay.characters;
import org.newdawn.slick.state.StateBasedGame;

import pathfinderlib.basics.Matrix;
import pathfinderlib.basics.Moves;
import states.Jeu;

public class NormalZombie extends Ennemies{
	private static final long serialVersionUID = 1480552482164050522L;
	/*protected Image normalZombie;
	protected int Tab[] = {0,32,64,96,128,160,192,224,256,288,320,352,384,416,448,480,512,544,576,608,640,672,704,736,768};
	private int x = Tab[(int)Math.random()*Tab.length];
	private int y = Tab[(int)Math.random()*Tab.length];
	private int HP;
	
	private int damage;
	
	private int HPmax = 100;
	private int shield= 0;
	private int speed = 5;
	private String sprite = "pictures/BigZombie.png";// ressource en attente du zombie normal
	private Point depart = new Point(x,y);
	private Vector<Moves> pathfind = calculatePathToHouse(depart);
	private */

	public NormalZombie(StateBasedGame jeu) {
		super((int)(Math.random()*22)+1, (int)(Math.random()*22)+1, 50, 0, 100, "zombie3", jeu);
	}/*
	public  void load() throws SlickException{
		normalZombie = new Image(sprite);
=======
	public NormalZombie(StateBasedGame sbg) {
		super(position_rd_x(), position_rd_y(), 50, 0, 2, "zombie3", sbg);
>>>>>>> branch 'dev' of https://github.com/ttgc/HomeAlone3ilVersion.git
	}*/
}