package ressources;

import java.util.HashMap;

import org.newdawn.slick.Animation;
import org.newdawn.slick.Image;
import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Sound;
import org.newdawn.slick.UnicodeFont;
import org.newdawn.slick.font.effects.ColorEffect;

public final class Ressources {
	public static final HashMap<String, Image> SPRITES = new HashMap<String, Image>();
	public static final HashMap<String, Music> MUSICS = new HashMap<String, Music>();
	public static final HashMap<String, Sound> SOUNDS = new HashMap<String, Sound>();
	public static final HashMap<String, UnicodeFont> FONTS = new HashMap<String, UnicodeFont>();
	public static final HashMap<String, Animation> ANIMATIONS = new HashMap<String, Animation>();

	@SuppressWarnings("unchecked")
	public static void initFonts() throws SlickException {
		// Font inits
		ColorEffect a = new ColorEffect();
		UnicodeFont f;
		
		f = new UnicodeFont("ressources/fonts/double_feature.ttf", 48, false, false);
		f.addAsciiGlyphs();
		f.getEffects().add(a);
		f.loadGlyphs();
		FONTS.put("title", f);
		
		f = new UnicodeFont("ressources/fonts/shining.ttf", 14, false, false);
		f.addAsciiGlyphs();
		f.getEffects().add(a);
		f.loadGlyphs();
		FONTS.put("script", f);
	}

	public static void initSounds() throws SlickException {
		// Sounds inits
		SOUNDS.put("4/4", new Sound("ressources/sounds/4quart.ogg"));
		SOUNDS.put("boum", new Sound("ressources/sounds/boum.ogg"));
		SOUNDS.put("damage", new Sound("ressources/sounds/dmg.ogg"));
		SOUNDS.put("door", new Sound("ressources/sounds/door.ogg"));
		SOUNDS.put("elec_absorb", new Sound("ressources/sounds/elec_absorb.ogg"));
		SOUNDS.put("elec", new Sound("ressources/sounds/elec.ogg"));
		SOUNDS.put("intro", new Sound("ressources/sounds/intro.ogg"));
		SOUNDS.put("jackpot", new Sound("ressources/sounds/jackpot.ogg"));
		SOUNDS.put("psiou", new Sound("ressources/sounds/psiou.ogg"));
		SOUNDS.put("upgrade_final", new Sound("ressources/sounds/upgrade_final.ogg"));
		SOUNDS.put("upgrade", new Sound("ressources/sounds/upgrade.ogg"));
		SOUNDS.put("wave", new Sound("ressources/sounds/wave.ogg"));
		SOUNDS.put("zombie_cow", new Sound("ressources/sounds/zombie_cow.ogg"));
		SOUNDS.put("zombie", new Sound("ressources/sounds/zombie.ogg"));
		SOUNDS.put("zomboss", new Sound("ressources/sounds/zomboss.ogg"));
	}

	public static void initMusic() throws SlickException {
		// Music inits
		MUSICS.put("main", new Music("ressources/musics/main.ogg"));
	}

	public static void initSprite() throws SlickException {
		// Sprite inits
		SPRITES.put("kredit",new Image("ressources/pictures/Kredit.png"));
		SPRITES.put("placeHolder",new Image("ressources/pictures/placeHolder.png"));
		
		SPRITES.put("porteNul",new Image("ressources/pictures/porteNul.png"));
		SPRITES.put("fenetreNul",new Image("ressources/pictures/fenetreNul.png"));
		SPRITES.put("toitNul",new Image("ressources/pictures/toitNul.png"));
		SPRITES.put("murNul",new Image("ressources/pictures/murNul.png"));
		
		SPRITES.put("porteStandard",new Image("ressources/pictures/porteStandard.png"));
		SPRITES.put("fenetreStandard",new Image("ressources/pictures/fenetreStandard.png"));
		SPRITES.put("toitTuile",new Image("ressources/pictures/toitTuile.png"));
		SPRITES.put("murStandard",new Image("ressources/pictures/murStandard.png"));
		
		SPRITES.put("porteBoisSolide",new Image("ressources/pictures/porteBoisSolide.png"));
		SPRITES.put("fenetreBoisSolide",new Image("ressources/pictures/fenetreBoisSolide.png"));
		SPRITES.put("toitBoisSolide",new Image("ressources/pictures/toitBoisSolide.png"));
		SPRITES.put("murBoisSolide",new Image("ressources/pictures/murBoisSolide.png"));
		
		SPRITES.put("zombie", new Image("ressources/pictures/BigZombie.png"));
		SPRITES.put("portePierre",new Image("ressources/pictures/portePierre.png"));
		SPRITES.put("fenetrePierre",new Image("ressources/pictures/fenetrePierre.png"));
		SPRITES.put("toitPierre",new Image("ressources/pictures/toitPierre.png"));
		SPRITES.put("murPierre",new Image("ressources/pictures/murPierre.png"));
		
	}
	
	public static void initAnimation() throws SlickException {
		// Anim inits
	}
}
