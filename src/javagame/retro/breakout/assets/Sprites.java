package javagame.retro.breakout.assets;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

public class Sprites {

	// spritesheet

	public Image enemy1;
	public Image enemy2;
	public Image enemy3;

	public Sprites() throws SlickException {
		SpriteSheet sheet = new SpriteSheet("res/enemies.png", 65, 65, 2);
		enemy1 = sheet.getSubImage(0, 0);
		enemy2 = sheet.getSubImage(1, 0);
		enemy3 = sheet.getSubImage(2, 0);
	}

}
