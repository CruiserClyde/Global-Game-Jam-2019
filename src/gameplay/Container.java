package gameplay;

import java.io.Serializable;

import gameplay.characters.Entity;
import gameplay.house.House;
import gameplay.weapons.Weapon;
import main.Launcher;
import pathfinderlib.basics.Matrix;

public final class Container implements Serializable {
	private static final long serialVersionUID = -3167976635446965294L;
	private Matrix<Entity> entities;
	private Matrix<Weapon> weapons;
	private House house;
	
	public Container() {
		entities = new Matrix<Entity>(Launcher.WIDTH/32, Launcher.HEIGHT/32);
		weapons = new Matrix<Weapon>(Launcher.WIDTH/32, Launcher.HEIGHT/32);
		//house init
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
