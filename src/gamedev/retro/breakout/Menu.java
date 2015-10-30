package gamedev.retro.breakout;

import java.awt.Font;
import java.io.InputStream;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.TrueTypeFont;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.util.ResourceLoader;

public class Menu extends BasicGameState {

	private TrueTypeFont ttf;
	private Font awtFont;
	private Image image;
	private Image menuItem;
	private int menuItemY;
	private boolean isSplash = false;
	private Image mario;
	private TrueTypeFont ttf1;

	public Menu(int i) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(GameContainer container, StateBasedGame game) {
		// load a default java font
		Font awtFont = new Font("emulogic", Font.BOLD, 24);
		Font awtFont1 = new Font("emulogic", Font.BOLD, 15);
		ttf1 = new TrueTypeFont(awtFont1, false);
		ttf = new TrueTypeFont(awtFont, false);

		try {
			image = new Image("res/menu.png");
			menuItem = new Image("res/menuItem.png");
			SpriteSheet spriteSheet = new SpriteSheet("res/MarioPlayer.png",32, 32);
			mario = spriteSheet.getSubImage(0, 2);
			mario = mario.getFlippedCopy(true, false);
			mario = mario.getScaledCopy(50, 50);

		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		menuItemY = 375;

	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {
		if (!(isSplash)) {

			image.draw(0, 0, 800, 600);
			menuItem.draw(280, menuItemY);
			ttf.drawString(320, 375, "Start");
			ttf.drawString(320, 430, "Hightscore");
			ttf.drawString(320, 485, "Credits");

		} else {
			mario.draw(280, 300);
			ttf1.drawString(360, 320, "x");
			ttf.drawString(300, 200, "Level 1");
		}
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {
		
		if(isSplash){
			try { Thread.sleep(2000);
				sbg.enterState(1);
			} catch (Exception e) {}
		}
		Input input = gc.getInput();
		if (input.isKeyPressed(Input.KEY_DOWN)) {
			if (menuItemY < 485) {
				menuItemY += 55;
			}

		}

		if (input.isKeyPressed(Input.KEY_UP)) {
			if (menuItemY > 375) {
				menuItemY -= 55;
			}

		}

		if (input.isKeyPressed(Input.KEY_ENTER)) {
			switch (menuItemY) {
			case 375:
				isSplash = true;
				break;
			}
		}
		
		

	}

	@Override
	public int getID() {
		// TODO
		return 0;
	}

}
