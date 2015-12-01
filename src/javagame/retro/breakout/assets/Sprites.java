package javagame.retro.breakout.assets;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

public class Sprites {

	// spritesheet

	public Image Buzzy_Beetle;
	public Image Coin;
	public Image enemy3;
	public Image Spiny1;
	public Image Goomba;
	public Image Mario;
	public Image Luigi;
	public Image Spiny2;
	public Image fishGray;
	public Image mushroom1;
	public Image block1;
	public Image fishRed;
	public Image mushroom2;
	public Image block2;
	public Image flag;
	public Image Mushroom3;
	public Image block3;
	public Image ghost;
	public Image flower;

	public Sprites() throws SlickException {
		SpriteSheet sheet = new SpriteSheet("res/enemies.png", 65, 65, 2);
		Buzzy_Beetle = sheet.getSubImage(0, 0);
		Coin = sheet.getSubImage(0, 1);
		Goomba = sheet.getSubImage(0, 2);
		Mario = sheet.getSubImage(1, 0);
		Spiny2 = sheet.getSubImage(1, 1);
		Luigi = sheet.getSubImage(1, 2);
		Spiny1 = sheet.getSubImage(2, 0);
		fishGray = sheet.getSubImage(2, 1);
		mushroom1 = sheet.getSubImage(2, 2);
		block1 = sheet.getSubImage(3, 0);
		fishRed = sheet.getSubImage(3, 1);
		mushroom2 = sheet.getSubImage(3, 2);
		block2 = sheet.getSubImage(4, 0);
		flag = sheet.getSubImage(4, 1);
		Mushroom3 = sheet.getSubImage(4, 2);
		block3 = sheet.getSubImage(5, 0);
		ghost = sheet.getSubImage(5, 1);
		flower = sheet.getSubImage(5, 2);

	}

}
