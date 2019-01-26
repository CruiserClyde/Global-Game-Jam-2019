package gameplay;

import java.io.Serializable;

import org.newdawn.slick.SlickException;

import gameplay.characters.Entity;
import gameplay.house.Door;
import gameplay.house.House;
import gameplay.house.Roof;
import gameplay.house.Wall;
import gameplay.house.Window;
import gameplay.weapons.Weapon;
import main.Launcher;
import pathfinderlib.basics.Matrix;

public final class Container implements Serializable {
	private static final long serialVersionUID = -3167976635446965294L;
	private Matrix<Entity> entities;
	private Matrix<Weapon> weapons;
	private House house;
	
	//test
	private Door porteNul;
	private Wall murNul;
	private Roof toitNul;
	private Window fenetreNul;
	
	public Container() {
		entities = new Matrix<Entity>(Launcher.WIDTH/32, Launcher.HEIGHT/32);
		weapons = new Matrix<Weapon>(Launcher.WIDTH/32, Launcher.HEIGHT/32);
		//house init
		//test
		porteNul = new Door (100, 0, 0, 2,(float) 0.5, 1, 1,"porteStandard");
		murNul = new Wall (100, 0, 0, 2,(float) 0.5, 1, 1,"murStandard");
		toitNul = new Roof (100, 0, 0, 2,(float) 0.5, 1, 1,"toitTuile");
		fenetreNul = new Window (100, 0, 0, 2,(float) 0.5, 1, 1,"fenetreStandard");
		house = new House(10,10,murNul,toitNul,porteNul,fenetreNul);
	}
	
	public void setEntity(int x, int y, Entity ent) {
		entities.set(x, y, ent);
	}
	
	public void setWeapon(int x, int y, Weapon w) {
		weapons.set(x, y, w);
	}
	
	public House getHouse() {
		return house;
	}
	public void setHouse(House house) {
		this.house = house;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Matrix<Entity> getEntities() {
		return entities;
	}
	public Matrix<Weapon> getWeapons() {
		return weapons;
	}
}
