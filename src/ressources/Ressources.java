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
		
		f = new UnicodeFont("ressources/fonts/shining.ttf", 32, false, false);
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
		// Général
		SPRITES.put("kredit",new Image("ressources/pictures/Kredit.png"));
		SPRITES.put("placeHolder",new Image("ressources/pictures/placeHolder.png"));
		SPRITES.put("banniere", new Image("ressources/pictures/bannieresansLogo.png"));
		// Maison nulle
		SPRITES.put("porteNul",new Image("ressources/pictures/homeNul/porteNul.png"));
		SPRITES.put("fenetreNul",new Image("ressources/pictures/homeNul/fenetreNul.png"));
		SPRITES.put("toitNul",new Image("ressources/pictures/homeNul/toitNul.png"));
		SPRITES.put("murNul",new Image("ressources/pictures/homeNul/murNul.png"));
		// Maison standarde
		SPRITES.put("porteStandard",new Image("ressources/pictures/homeStandard/porteStandard.png"));
		SPRITES.put("fenetreStandard",new Image("ressources/pictures/homeStandard/fenetreStandard.png"));
		SPRITES.put("toitTuile",new Image("ressources/pictures/homeStandard/toitTuile.png"));
		SPRITES.put("murStandard",new Image("ressources/pictures/homeStandard/murStandard.png"));
		// Maison solide
		SPRITES.put("porteBoisSolide",new Image("ressources/pictures/homeSolid/porteBoisSolide.png"));
		SPRITES.put("fenetreBoisSolide",new Image("ressources/pictures/homeSolid/fenetreBoisSolide.png"));
		SPRITES.put("toitBoisSolide",new Image("ressources/pictures/homeSolid/toitBoisSolide.png"));
		SPRITES.put("murBoisSolide",new Image("ressources/pictures/homeSolid/murBoisSolide.png"));
		// Maison pierre
		SPRITES.put("portePierre",new Image("ressources/pictures/homeRock/portePierre.png"));
		SPRITES.put("fenetrePierre",new Image("ressources/pictures/homeRock/fenetrePierre.png"));
		SPRITES.put("toitPierre",new Image("ressources/pictures/homeRock/toitPierre.png"));
		SPRITES.put("murPierre",new Image("ressources/pictures/homeRock/murPierre.png"));
		// Maison metal
		SPRITES.put("porteMetal",new Image("ressources/pictures/homeMetal/porteMetal.png"));
		SPRITES.put("fenetreMetal",new Image("ressources/pictures/homeMetal/fenetreMetal.png"));
		SPRITES.put("toitMetal",new Image("ressources/pictures/homeMetal/toitMetal.png"));
		SPRITES.put("murMetal",new Image("ressources/pictures/homeMetal/murMetal.png"));
		// Maison du futur
		SPRITES.put("porteFutur",new Image("ressources/pictures/homeFutur/porteFutur.png"));
		SPRITES.put("fenetreFutur",new Image("ressources/pictures/homeFutur/fenetreFutur.png"));
		SPRITES.put("toitFutur",new Image("ressources/pictures/homeFutur/toitFutur.png"));
		SPRITES.put("murFutur",new Image("ressources/pictures/homeFutur/murFutur.png"));
		// Ennemies
		SPRITES.put("zombie", new Image("ressources/pictures/charactersEnnemies/BigZombie.png"));
		// Tiles
		SPRITES.put("grass", new Image("ressources/pictures/Sprites/grass.png"));
		SPRITES.put("grassFlowers", new Image("ressources/pictures/Sprites/grassFlowers.png"));
		SPRITES.put("pathNormal", new Image("ressources/pictures/Sprites/pathNormal.png"));
		SPRITES.put("pathAngled", new Image("ressources/pictures/Sprites/pathAngled.png"));
		SPRITES.put("bigRock", new Image("ressources/pictures/Sprites/bigRock.png"));
		SPRITES.put("smallRocks", new Image("ressources/pictures/Sprites/smallRocks.png"));
	}
	
	public static void initAnimation() throws SlickException {
		// Anim inits
	}
}
