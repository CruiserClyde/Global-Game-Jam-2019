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
	}

	public static void initMusic() throws SlickException {
		// Music inits
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
