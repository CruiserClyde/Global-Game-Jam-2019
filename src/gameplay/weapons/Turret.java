package gameplay.weapons;

import gameplay.Container;
import gameplay.characters.Entity;
import gameplay.characters.Side;
import main.Launcher;
import pathfinderlib.basics.Matrix;
import ressources.Ressources;

public class Turret extends Weapon {
	private static final long serialVersionUID = -4216830860047342791L;
	private int timer;

	public Turret(int x, int y, String sprite, Container cnt) {
		super(x, y, 100, 0, 1, 20, "placeHolder", cnt);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(int delta) {
		// TODO Auto-generated method stub
		timer+=delta;
		if (timer > 1000) {
			if (charge < 100) {
				charge+=10;
			} else {
				trigger(cnt.getEntities());
			}
		}
	}

	@Override
	public void trigger(Matrix<Entity> entities) {
		// TODO Auto-generated method stub
		int touched = 0;
		for (int dx=-1;dx<=1;dx++) {
			for (int dy=-1;dy<=1;dy++) {
				if (x+dx >= 0 && x+dx < Launcher.WIDTH/32 && y+dy >= 0 && y+dy < Launcher.HEIGHT/32) {
					if (entities.get(x+dx, y+dy) != null && entities.get(x+dx, y+dy).getSide().equals(Side.Ennemy)) {
						entities.get(x+dx, y+dy).getDamage(10);
						touched++;
					}
				}
			}
		}
		if (touched > 0) {
			charge = 0;
			Ressources.SOUNDS.get("psiou").play();
		}
	}

}
