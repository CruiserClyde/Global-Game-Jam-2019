package gameplay;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.newdawn.slick.Graphics;
import gameplay.characters.Entity;
import gameplay.house.Door;
import gameplay.house.House;
import gameplay.house.Roof;
import gameplay.house.Tier;
import gameplay.house.Wall;
import gameplay.house.Window;
import gameplay.interfaces.Rendering;
import gameplay.weapons.Weapon;
import main.Launcher;
import pathfinderlib.basics.Matrix;
import ressources.Ressources;

public final class Container implements Serializable, Rendering {
	private static final long serialVersionUID = -3167976635446965294L;
	private Matrix<Entity> entities;
	private Matrix<Weapon> weapons;
	private House house;
	private Matrix<String> tiles;
	
	//test
	private Door porteNul;
	private Wall murNul;
	private Roof toitNul;
	private Window fenetreNul;
	
	public Container() {
		entities = new Matrix<Entity>(Launcher.WIDTH/32, Launcher.HEIGHT/32);
		weapons = new Matrix<Weapon>(Launcher.WIDTH/32, Launcher.HEIGHT/32);
		
		// house init
		porteNul = new Door (0,"porteNul",Tier.Nul);
		murNul = new Wall (0,"murNul",Tier.Nul);
		toitNul = new Roof (0,"toitNul",Tier.Nul);
		fenetreNul = new Window (0,"fenetreNul", Tier.Nul);
		house = new House(10,10,murNul,toitNul,porteNul,fenetreNul);
		
		File f = new File("map.txt");
		if (!f.exists() || !f.isFile()) {
			System.exit(1);
		}
		List<String> lignes = null;
		int height = 0;
		int width = 0;
		try {
			lignes = Files.readAllLines(Paths.get(f.getPath()));
			height = lignes.size();
			int mapstart = 0;
			do {
				if (mapstart >= lignes.size()) {
					System.exit(2);
				}
				width = lignes.get(mapstart).trim().length();
				mapstart++;
			} while (lignes.get(mapstart).isEmpty());
			mapstart--;
			if (height != lignes.size() || width != lignes.get(0).trim().length()) {
				System.exit(3);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(3);
		}
		tiles = new Matrix<String>(Launcher.WIDTH/32, Launcher.HEIGHT/32);
		for (int i=0;i<Launcher.WIDTH/32;i++) {
			for (int k=0;k<Launcher.HEIGHT/32;k++) {
				tiles.set(i, k, "");
			}
		}
		for (int i = 0; i < height; i++) {
			String lg = lignes.get(i).trim();
			if (lg.trim().isEmpty()) {
				continue;
			}
			if (lg.length() != width) {
				System.exit(4);
			}
			for (int j = 0; j < width; j++) {
				switch(lg.charAt(j)) {
				case '1':
					tiles.set(j, i, "grass");
					break;
				case '2':
					tiles.set(j, i, "grassFlowers");
					break;
				case '4':
					tiles.set(j, i, "pathNormal");
					break;
				case '5':
					tiles.set(j, i, "pathAngled");
					break;
				case '7':
					tiles.set(j, i, "bigRock");
					break;
				case '8':
					tiles.set(j, i, "smallRocks");
					break;
				default :
					System.exit(5);
				}
			}
		}
	}
	
	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		for (int i=0;i<Launcher.WIDTH/32;i++) {
			for (int k=0;k<Launcher.HEIGHT/32;k++) {
				if (!tiles.get(i, k).isEmpty()) {
					g.drawImage(Ressources.SPRITES.get(tiles.get(i, k)), i*32, k*32);
				}
			}
		}
		
		house.render(g);
		for (int i=0;i<Launcher.WIDTH/32;i++) {
			for (int k=0;k<Launcher.HEIGHT/32;k++) {
				if (entities.get(i, k) != null) {
					entities.get(i, k).render(g);
				}
				if (weapons.get(i, k) != null) {
					weapons.get(i, k).render(g);
				}
			}
		}
	}

	@Override
	public void update(int delta) {
		// TODO Auto-generated method stub
		for (int i=0;i<Launcher.WIDTH/32;i++) {
			for (int k=0;k<Launcher.HEIGHT/32;k++) {
				if (entities.get(i, k) != null) {
					entities.get(i, k).update(delta);
				}
				if (weapons.get(i, k) != null) {
					weapons.get(i, k).update(delta);
				}
			}
		}
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
