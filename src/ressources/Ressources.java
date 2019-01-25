package ressources;

import java.util.HashMap;

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
	}
}
